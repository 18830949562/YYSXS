package com.hlf.vo;

import lombok.*;

/**
 * @Description: ResultModel
 * @author: hansk
 * @date: 2021/10/26/ 14:26
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResultModel<T> {

    private String status = "0";

    private String msg = "成功";

    private T res;

    public void buildMsg(String status,String msg){
        this.status = status;
        this.msg = msg;
    }
}
