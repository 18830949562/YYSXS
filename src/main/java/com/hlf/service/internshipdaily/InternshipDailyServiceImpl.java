package com.hlf.service.internshipdaily;

import com.hlf.constants.Constants;
import com.hlf.mapper.InternshipDailyMapper;
import com.hlf.pojo.Feedback;
import com.hlf.pojo.InternshipInfo;
import com.hlf.pojo.Record;
import com.hlf.vo.Leave;
import com.hlf.vo.LeaveInfo;
import com.hlf.vo.UserRole;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: InternshipDaily
 * @author: hanlf
 * @date: 2021/10/26/ 15:18
 */
@Service
@Slf4j
public class InternshipDailyServiceImpl implements InternshipDailyService{

    @Autowired
    private InternshipDailyMapper internshipDailyMapper;


    @Override
    public List<Record> getInternshipRecord() {
        return internshipDailyMapper.getInternshipRecord();
    }

    @Override
    public List<InternshipInfo> getInternshipInfo() {
        return internshipDailyMapper.getInternshipInfo();
    }

    @Override
    public Integer addLeave(Leave leave) {
        return internshipDailyMapper.addLeave(leave);
    }

    @Override
    public UserRole getUserInfos(String userName) {
        return internshipDailyMapper.getUserInfos(userName);
    }

    @Override
    public List<LeaveInfo> getLeave(UserRole userRole) {
        List<LeaveInfo> leaveInfoLists;
        if(userRole.getRoleRelation().equals(Constants.HIGHEST)){
            leaveInfoLists = internshipDailyMapper.getLeave(null);
            return leaveInfoLists;
        }
        leaveInfoLists = internshipDailyMapper.getLeave(userRole);
        return leaveInfoLists;
    }

    @Override
    public Integer feedbackApply(Feedback feedback) {
        return internshipDailyMapper.feedbackApply(feedback);
    }
}
