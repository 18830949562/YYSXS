package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: internship
 * @author: hansk
 * @date: 2021/10/26/ 14:23
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Internship {

    private Integer internshipId;

    private String internshipName;

    private String internshipAge;

    private String internshipSex;

    private String internshipEducation;

    private String departmentName;

    private String doctorName;
}
