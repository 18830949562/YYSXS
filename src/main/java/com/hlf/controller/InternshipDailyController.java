package com.hlf.controller;

import com.hlf.pojo.Feedback;
import com.hlf.pojo.InternshipInfo;
import com.hlf.pojo.Record;
import com.hlf.service.internshipdaily.InternshipDailyService;
import com.hlf.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 实习日常
 * @author: hanlf
 * @date: 2021/10/26/ 15:17
 */
@RestController
@Slf4j
@RequestMapping(value = "/hlf")
public class InternshipDailyController {

    @Autowired
    private InternshipDailyService internshipDailyService;

    //查询实习记录
    @PostMapping("/getInternshipRecord")
    public ResultModel<Object> getInternshipRecord(){
        ResultModel<Object> ResultModel = new ResultModel<>();
        List<Record> recordList;
        try {
            recordList = internshipDailyService.getInternshipRecord();
            ResultModel.setRes(recordList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",new ArrayList<>());
        }
        return ResultModel;
    }

    //查询实习信息
    @PostMapping("/getInternshipInfo")
    public ResultModel<Object> getInternshipInfo(){
        ResultModel<Object> ResultModel = new ResultModel<>();
        List<InternshipInfo> internshipInfoList;
        try {
            internshipInfoList = internshipDailyService.getInternshipInfo();
            ResultModel.setRes(internshipInfoList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",new ArrayList<>());
        }
        return ResultModel;
    }

    //请假申请
    @PostMapping("/addLeave")
    public ResultModel<Object> addLeave(@RequestBody Leave leave,HttpServletRequest request){
        ResultModel<Object> ResultModel = new ResultModel<>();
        UserInfo userInfos = (UserInfo) request.getAttribute("userInfos");
        if(userInfos == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        leave.setLeaveName(userInfos.getUserName());
        Integer i = internshipDailyService.addLeave(leave);
        if(i>0){
            return ResultModel;
        }else {
            return new ResultModel<>("-1","添加失败",new ArrayList<>());
        }
    }

    //查询申请
    @PostMapping("/getLeave")
    public ResultModel<Object> getLeave(HttpServletRequest request){
        ResultModel<Object> ResultModel = new ResultModel<>();
        UserInfo userInfos = (UserInfo) request.getAttribute("userInfos");
        if(userInfos == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        UserRole userRole = internshipDailyService.getUserInfos(userInfos.getUserName());
        if(userRole == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        List<LeaveInfo> leaveInfoList;
        try {
            leaveInfoList = internshipDailyService.getLeave(userRole);
            ResultModel.setRes(leaveInfoList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",new ArrayList<>());
        }
        return ResultModel;
    }

    //反馈
    @PostMapping("/feedbackApply")
    public ResultModel<Object> feedbackApply(@RequestBody Feedback feedback, HttpServletRequest request){
        ResultModel<Object> ResultModel = new ResultModel<>();
        UserInfo userInfos = (UserInfo) request.getAttribute("userInfos");
        if(userInfos == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        feedback.setFeedbackName(userInfos.getUserName());
        Integer i = internshipDailyService.feedbackApply(feedback);
        if(i>0){
            return ResultModel;
        }else {
            return new ResultModel<>("-1","添加失败",new ArrayList<>());
        }
    }


}
