package com.hlf.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 菜单
 * @author: hansk
 * @date: 2021/10/13/ 15:27
 */
@Data
public class Menu {

    private Integer id;

    private String menuName;

    private Integer pid;

    private String url;

    List<Menu> list = new ArrayList<>();
}
