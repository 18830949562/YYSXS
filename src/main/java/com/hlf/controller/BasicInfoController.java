package com.hlf.controller;

import com.hlf.pojo.Department;
import com.hlf.pojo.Doctor;
import com.hlf.pojo.Internship;
import com.hlf.service.basicinfo.BasicInfoService;
import com.hlf.vo.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Description: 基本信息管理
 * @author: hansk
 * @date: 2021/10/25/ 16:56
 */
@RestController
@Slf4j
@RequestMapping(value = "/hlf")
public class BasicInfoController {

    @Autowired
    private BasicInfoService basicInfoService;

    //查询科室
    @PostMapping("/getDepartment")
    public ResultModel<Object> getDepartment(){
        ResultModel<Object> ResultModel = new ResultModel<>();
        List<Department> departmentList;
        try {
            departmentList = basicInfoService.getDepartment();
            ResultModel.setRes(departmentList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",null);
        }
        return ResultModel;
    }

    //查询医生
    @PostMapping("/getDoctor")
    public ResultModel<Object> getDoctor(){
        ResultModel<Object> ResultModel = new ResultModel<>();
        List<Doctor> doctorList;
        try {
            doctorList = basicInfoService.getDoctor();
            ResultModel.setRes(doctorList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",null);
        }
        return ResultModel;
    }

    //查询实习生
    @PostMapping("/getInternship")
    public ResultModel<Object> getInternship(){
        ResultModel<Object> ResultModel = new ResultModel<>();
        List<Internship> internshipList;
        try {
            internshipList = basicInfoService.getInternship();
            ResultModel.setRes(internshipList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel<>("-1","接口发生异常",null);
        }
        return ResultModel;
    }

}
