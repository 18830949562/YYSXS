package com.hlf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlf.pojo.InternshipInfo;
import com.hlf.pojo.Notice;
import com.hlf.vo.Dos;
import com.hlf.vo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemManagementMapper extends BaseMapper<Notice> {
    List<UserInfo> setUpDoc();

    List<UserInfo> setUpInte();

    void test(@Param("dosList") List<Dos> list);

    void updateTest(@Param("dos")Dos dos);

}
