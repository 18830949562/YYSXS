package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: notice
 * @author: hansk
 * @date: 2021/11/01/ 16:14
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Notice {

    private Integer noticeId;

    private String noticeTitle;

    private String noticeContent;

    private String noticeUrl;

    private String noticeStatus;


}
