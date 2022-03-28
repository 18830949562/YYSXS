package com.hlf.controller;

import com.hlf.pojo.Department;
import com.hlf.pojo.Feedback;
import com.hlf.pojo.Guidance;
import com.hlf.service.guidanceadmin.GuidanceAdminService;
import com.hlf.service.internshipdaily.InternshipDailyService;
import com.hlf.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 教员
 * @author: hansk
 * @date: 2021/11/02/ 14:55
 */
@RestController
@Slf4j
@RequestMapping(value = "/hlf")
public class GuidanceAdminController {

    @Autowired
    private GuidanceAdminService guidanceAdminService;
    @Autowired
    private InternshipDailyService internshipDailyService;

    //分配情况
    @PostMapping("/getDistributions")
    public ResultModel<Object> getDistributions(){
        ResultModel<Object> ResultModel = new ResultModel<>();
        List<Guidance> guidanceList;
        try {
            guidanceList = guidanceAdminService.getDistribution();
            ResultModel.setRes(guidanceList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",null);
        }
        return ResultModel;
    }

    //请假审批情况
    @PostMapping("/getLeaveApproval")
    public ResultModel<Object> getLeaveApproval(HttpServletRequest request){
        ResultModel<Object> ResultModel = new ResultModel<>();
        UserInfo userInfos = (UserInfo) request.getAttribute("userInfos");
        if(userInfos == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        UserRole userRole = internshipDailyService.getUserInfos(userInfos.getUserName());
        if(userRole == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        List<LeaveInfo> leaveList;
        try {
            leaveList = guidanceAdminService.getLeaveApproval(userRole);
            ResultModel.setRes(leaveList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",null);
        }
        return ResultModel;
    }

    //反馈查看
    @PostMapping("/getFeedback")
    public ResultModel<Object> getFeedback(HttpServletRequest request){
        ResultModel<Object> ResultModel = new ResultModel<>();
        UserInfo userInfos = (UserInfo) request.getAttribute("userInfos");
        if(userInfos == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        UserRole userRole = internshipDailyService.getUserInfos(userInfos.getUserName());
        if(userRole == null){
            return new ResultModel("-1","未获取到用户信息",new ArrayList<>());
        }
        List<Feedback> feedbackList;
        try {
            feedbackList = guidanceAdminService.getFeedback(userRole);
            ResultModel.setRes(feedbackList);
        }catch (Exception e){
            log.info("getDepartment接口发生异常");
            return new ResultModel("-1","接口发生异常",null);
        }
        return ResultModel;
    }


}
