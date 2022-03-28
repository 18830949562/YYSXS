package com.hlf.service.systemmanagement;

import com.hlf.mapper.SystemManagementMapper;
import com.hlf.pojo.InternshipInfo;
import com.hlf.pojo.Notice;
import com.hlf.vo.Dos;
import com.hlf.vo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: s
 * @author: hansk
 * @date: 2021/11/01/ 10:53
 */
@Service
@Slf4j
public class SystemManagementServiceImpl implements SystemManagementService {

    @Autowired
    private SystemManagementMapper systemManagementMapper;

    @Override
    public List<Notice> notice() {
        return systemManagementMapper.selectList(null);
    }

    @Override
    public List<UserInfo> setUp() {
        List<UserInfo> userInfoList;
        userInfoList = systemManagementMapper.setUpDoc();
        List<UserInfo> userInfoLists;
        userInfoLists = systemManagementMapper.setUpInte();
        userInfoList.addAll(userInfoLists);
        return userInfoList;
    }

    @Override
    public void test(List<Dos> list) {
        systemManagementMapper.test(list);
    }

    @Override
    public void updateTest(Dos dos) {
        systemManagementMapper.updateTest(dos);
    }

}
