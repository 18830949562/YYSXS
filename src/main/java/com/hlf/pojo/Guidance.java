package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description:
 * @author: hansk
 * @date: 2021/11/02/ 15:45
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Guidance {

    private Integer guidanceId;

    private String internshipName;

    private String internshipTask;

    private String internshipDepartment;

    private String internshipTime;


}
