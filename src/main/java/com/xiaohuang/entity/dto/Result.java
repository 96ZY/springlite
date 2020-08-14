package com.xiaohuang.entity.dto;

import lombok.Data;

@Data
public class Result<T> {
    // 本次请求的状态码，200表示成功
    private int code;
    // 本次请求的结果详情
    private String msg;
    // 本次请求返回的结果集
    private T data;
}
