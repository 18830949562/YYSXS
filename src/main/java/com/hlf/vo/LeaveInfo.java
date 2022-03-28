package com.hlf.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: leaveInfo
 * @author: hanlf
 * @date: 2021/10/28/ 14:22
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LeaveInfo {

    private Integer leaveId;

    private String leaveName;

    private String leaveStartTime;

    private String leaveEndTime;

    private String leaveReason;

    private String departmentName;

    private String doctorName;

    private String StatusName;
}
