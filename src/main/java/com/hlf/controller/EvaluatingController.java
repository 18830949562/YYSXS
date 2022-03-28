package com.hlf.controller;

import com.hlf.pojo.Guidance;
import com.hlf.service.evaluating.EvaluatingService;
import com.hlf.service.guidanceadmin.GuidanceAdminService;
import com.hlf.service.internshipdaily.InternshipDailyService;
import com.hlf.vo.ResultModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 评测
 * @author: hlf
 * @date: 2021/11/11/ 14:52
 */
@RestController
@RequestMapping("/hlf")
@Slf4j
public class EvaluatingController {

    @Autowired
    private EvaluatingService evaluatingService;

    //分配情况
    @PostMapping("/getDistribution")
    public ResultModel<Object> getDistribution(){
        ResultModel<Object> ResultModel = new ResultModel<>();

        return ResultModel;
    }
}
