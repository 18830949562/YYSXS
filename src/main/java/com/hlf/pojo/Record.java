package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: Record
 * @author: hanlf
 * @date: 2021/10/26/ 15:42
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Record {

    private Integer id;
    
    private String internshipName;
    
    private String internshipTime;
    
    private String departmentName;

    private String typeName;

}
