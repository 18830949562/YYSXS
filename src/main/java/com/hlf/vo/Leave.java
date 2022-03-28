package com.hlf.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description: leave
 * @author: hanlf
 * @date: 2021/10/27/ 14:56
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Leave {

    private Integer leaveId;

    private String leaveName;

    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String leaveStartTime;

    private String leaveEndTime;

    private String leaveReason;

    private Integer leaveDepartment;

    private Integer leaveDoctor;

    private Integer leaveStatus;

}
