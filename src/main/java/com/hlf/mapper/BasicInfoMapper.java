package com.hlf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlf.pojo.Department;
import com.hlf.pojo.Doctor;
import com.hlf.pojo.Internship;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasicInfoMapper extends BaseMapper<Department> {

    List<Doctor> getDoctor();

    List<Internship> getInternship();
}

