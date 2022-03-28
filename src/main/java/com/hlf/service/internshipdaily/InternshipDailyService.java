package com.hlf.service.internshipdaily;

import com.hlf.pojo.Feedback;
import com.hlf.pojo.InternshipInfo;
import com.hlf.pojo.Record;
import com.hlf.vo.Leave;
import com.hlf.vo.LeaveInfo;
import com.hlf.vo.UserRole;

import java.util.List;

public interface InternshipDailyService {

    List<Record> getInternshipRecord();

    List<InternshipInfo> getInternshipInfo();

    Integer addLeave(Leave leave);

    UserRole getUserInfos(String userName);

    List<LeaveInfo> getLeave(UserRole userRole);

    Integer feedbackApply(Feedback feedback);
}
