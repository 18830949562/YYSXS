package com.hlf.service.systemmanagement;

import com.hlf.pojo.Doctor;
import com.hlf.pojo.InternshipInfo;
import com.hlf.pojo.Notice;
import com.hlf.vo.Dos;
import com.hlf.vo.ResultModel;
import com.hlf.vo.UserInfo;

import java.util.List;

public interface SystemManagementService {
    List<Notice> notice();

    List<UserInfo> setUp();

    void test(List<Dos> list);

    void updateTest(Dos dos);

}
