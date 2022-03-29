package com.hlf.controller;

import com.hlf.pojo.Notice;
import com.hlf.service.systemmanagement.SystemManagementService;
import com.hlf.vo.Dos;
import com.hlf.vo.ResultModel;
import com.hlf.vo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: hansk
 * @date: 2021/11/01/ 10:44
 */
@RestController
@Slf4j
@RequestMapping(value = "/hlf")
public class SystemManagementController {

    @Autowired
    private SystemManagementService systemManagementService;

    //公告
    @PostMapping(value = "/notice")
    public ResultModel<Object> notice(){
        ResultModel<Object> resultModel = new ResultModel<>();
        List<Notice> noticeList;
        try {
            noticeList = systemManagementService.notice();
            resultModel.setRes(noticeList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",new ArrayList<>());
        }
        return resultModel;
    }

    //角色查询
    @PostMapping(value = "/setUp")
    public ResultModel<Object> setUp(){
        ResultModel<Object> resultModel = new ResultModel<>();
        List<UserInfo> userInfoList;
        try {
            userInfoList = systemManagementService.setUp();
            resultModel.setRes(userInfoList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",new ArrayList<>());
        }
        return resultModel;
    }



}
