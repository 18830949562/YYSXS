package com.hlf.service.loginservice;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hlf.mapper.LoginMapper;
import com.hlf.vo.Menu;
import com.hlf.vo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 登录
 * @author: hansk
 * @date: 2021/10/13/ 14:48
 */
@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserInfo getLoginInfo(UserInfo userInfo) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>(userInfo);
        return loginMapper.selectOne(queryWrapper);
    }

    @Override
    public List<Menu> getMenuInfo(String userName) {
        //父级菜单
        List<Menu> list = loginMapper.getMenuInfo(userName);
        //子级菜单
        List<Menu> plist = loginMapper.getMenuInfos();

        for (Menu menu:list) {
                for (Menu pMenu:plist) {
                    if(menu.getId().equals(pMenu.getPid())){
                        menu.getList().add(pMenu);
                    }
                }
        }
        return list;
    }
}
