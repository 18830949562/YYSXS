package com.hlf.service.basicinfo;

import com.hlf.mapper.BasicInfoMapper;
import com.hlf.pojo.Department;
import com.hlf.pojo.Doctor;
import com.hlf.pojo.Internship;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: BasicInfoService
 * @author: hansk
 * @date: 2021/10/26/ 14:32
 */
@Service
@Slf4j
public class BasicInfoServiceImpl implements BasicInfoService{

    @Autowired
    private BasicInfoMapper basicInfoMapper;

    @Override
    public List<Department> getDepartment() {
        return basicInfoMapper.selectList(null);
    }

    @Override
    public List<Doctor> getDoctor() {
        return basicInfoMapper.getDoctor();
    }

    @Override
    public List<Internship> getInternship() {
        return basicInfoMapper.getInternship();
    }

}
