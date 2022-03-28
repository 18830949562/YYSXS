package com.hlf.service.loginservice;

import com.hlf.vo.Menu;
import com.hlf.vo.UserInfo;

import java.util.List;

public interface LoginService {

    UserInfo getLoginInfo(UserInfo userInfo);

    List<Menu> getMenuInfo(String userName);
}
