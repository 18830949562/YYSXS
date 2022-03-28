package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: Department
 * @author: hansk
 * @date: 2021/10/26/ 9:54
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private Integer departmentId;

    private String departmentName;

    private String departmentAdmin;

    private String inpatientWard;

}
