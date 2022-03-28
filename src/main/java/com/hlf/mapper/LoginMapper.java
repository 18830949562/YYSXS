package com.hlf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hlf.vo.Menu;
import com.hlf.vo.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginMapper extends BaseMapper<UserInfo> {


    List<Menu> getMenuInfo(@Param("userName") String userName);

    List<Menu> getMenuInfos();
}
