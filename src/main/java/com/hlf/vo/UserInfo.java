package com.hlf.vo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 用户信息
 * @author: hansk
 * @date: 2021/10/13/ 14:50
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo{

    private String userName;

    private String password;
}
