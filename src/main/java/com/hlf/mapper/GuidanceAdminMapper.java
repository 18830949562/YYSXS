package com.hlf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlf.pojo.Feedback;
import com.hlf.pojo.Guidance;
import com.hlf.vo.LeaveInfo;
import com.hlf.vo.UserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuidanceAdminMapper extends BaseMapper<Guidance> {

    List<LeaveInfo> getLeaveApproval(@Param("userRole") UserRole userRole);

    List<Feedback> getFeedback();
}
