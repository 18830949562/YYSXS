package com.hlf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlf.pojo.Feedback;
import com.hlf.pojo.InternshipInfo;
import com.hlf.pojo.Record;
import com.hlf.vo.Leave;
import com.hlf.vo.LeaveInfo;
import com.hlf.vo.UserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipDailyMapper extends BaseMapper<Leave>{

    List<Record> getInternshipRecord();

    List<InternshipInfo> getInternshipInfo();

    Integer addLeave(@Param("leave") Leave leave);

    UserRole getUserInfos(@Param("userName") String userName);

    List<LeaveInfo> getLeave(@Param("userRole") UserRole userRole);

    Integer feedbackApply(@Param("feedback") Feedback feedback);
}
