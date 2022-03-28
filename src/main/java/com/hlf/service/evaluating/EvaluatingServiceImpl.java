package com.hlf.service.evaluating;

import com.hlf.mapper.EvaluatingMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 评测
 * @author: hansk
 * @date: 2021/11/11/ 15:05
 */
@Service
@Slf4j
public class EvaluatingServiceImpl implements EvaluatingService{

    @Autowired
    private EvaluatingMapper evaluatingMapper;


}
