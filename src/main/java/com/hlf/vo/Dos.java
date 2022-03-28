package com.hlf.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

/**
 * @Description: s
 * @author: hansk
 * @date: 2022/01/05/ 15:06
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Dos {

    private Integer doctorId;

    private String doctorName;

    private String doctorAge;

    private String DOCTOR_SEX;

    private String departmentName;

    private String doctorTitle;


}
