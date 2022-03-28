package com.hlf.service.basicinfo;

import com.hlf.pojo.Department;
import com.hlf.pojo.Doctor;
import com.hlf.pojo.Internship;

import java.util.List;

public interface BasicInfoService {

    List<Department> getDepartment();

    List<Doctor> getDoctor();

    List<Internship> getInternship();
}
