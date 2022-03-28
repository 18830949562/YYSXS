package com.hlf.service.guidanceadmin;

import com.hlf.constants.Constants;
import com.hlf.mapper.GuidanceAdminMapper;
import com.hlf.pojo.Feedback;
import com.hlf.pojo.Guidance;
import com.hlf.vo.LeaveInfo;
import com.hlf.vo.UserRole;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: hansk
 * @date: 2021/11/02/ 14:57
 */
@Service
@Slf4j
public class GuidanceAdminServiceImpl implements GuidanceAdminService{

    @Autowired
    private GuidanceAdminMapper guidanceAdminMapper;

    @Override
    public List<Guidance> getDistribution() {
        return guidanceAdminMapper.selectList(null);
    }

    @Override
    public List<LeaveInfo> getLeaveApproval(UserRole userRole) {
        List<LeaveInfo> leaveInfoLists;
        if(userRole.getRoleId().equals(Constants.ROLE_ID)){
            leaveInfoLists = guidanceAdminMapper.getLeaveApproval(null);
            return leaveInfoLists;
        }
        leaveInfoLists = guidanceAdminMapper.getLeaveApproval(userRole);
        return leaveInfoLists;
    }

    @Override
    public List<Feedback> getFeedback(UserRole userRole) {
        List<Feedback> feedbackList;
        if(userRole.getRoleRelation().equals(Constants.ROLE_ID)){
            feedbackList = guidanceAdminMapper.getFeedback();
            return feedbackList;
        }
        return new ArrayList<>();
    }
}
