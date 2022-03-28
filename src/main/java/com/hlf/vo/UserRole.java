package com.hlf.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: userrole
 * @author: hansk
 * @date: 2021/10/28/ 14:55
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserRole {

    private Integer id;

    private String userName;

    private String password;

    private String roleId;

    private String roleName;

    private String roleRelation;

}
