package com.hlf.controller;

import com.hlf.service.loginservice.LoginService;
import com.hlf.vo.Menu;
import com.hlf.vo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description: 登录以及返回信息
 * @author: hanlf
 * @date: 2021/10/13/ 14:44
 */
@RestController
@Slf4j
@RequestMapping(value = "/hlf")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public boolean login(@RequestBody UserInfo userInfo, HttpSession httpSession){
        UserInfo userInfos = loginService.getLoginInfo(userInfo);
        if(userInfos!=null){
            httpSession.setAttribute("userInfos",userInfos);
            log.info("登录成功，登录信息为:{}",userInfo);
            return true;
        }
        return false;
    }

    @PostMapping("/menu")
    public List<Menu> menu(HttpSession httpSession){
        //UserInfo userInfos = (UserInfo) httpSession.getAttribute("userInfos");
        UserInfo userInfos = new UserInfo();
        userInfos.setUserName("hansk");
        List<Menu> menu = loginService.getMenuInfo(userInfos.getUserName());
        return menu;
    }
}
