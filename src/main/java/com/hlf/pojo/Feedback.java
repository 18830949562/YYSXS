package com.hlf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description: 反馈
 * @author: hansk
 * @date: 2021/11/11/ 9:52
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    private Integer feedbackId;

    private String feedbackName;

    private String feedbackContent;

    private String feedbackTime;

}
