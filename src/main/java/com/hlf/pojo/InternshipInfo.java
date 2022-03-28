package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: internshipInfo
 * @author: hansk
 * @date: 2021/10/27/ 14:45
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InternshipInfo {

    private Integer id;

    private String internshipName;

    private String internshipInfo;

    private String internshipTime;

    private String departmentName;

}
