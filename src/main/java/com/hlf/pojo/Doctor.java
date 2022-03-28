package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: doctor
 * @author: hansk
 * @date: 2021/10/26/ 14:21
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    private Integer doctorId;

    private String doctorName;

    private String doctorAge;

    private String doctorSex;

    private String departmentName;

    private String doctorTitle;

}
