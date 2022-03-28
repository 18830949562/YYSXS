package com.hlf.service.guidanceadmin;

import com.hlf.pojo.Feedback;
import com.hlf.pojo.Guidance;
import com.hlf.vo.LeaveInfo;
import com.hlf.vo.UserRole;

import java.util.List;

public interface GuidanceAdminService {

    List<Guidance> getDistribution();

    List<LeaveInfo> getLeaveApproval(UserRole userRole);

    List<Feedback> getFeedback(UserRole userRole);
}
