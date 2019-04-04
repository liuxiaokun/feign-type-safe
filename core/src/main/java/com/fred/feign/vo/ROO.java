package com.fred.feign.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2019/4/4
 */
@Data
@AllArgsConstructor
@ToString
public class ROO<T> {

    private boolean success;
    private int code;
    private String message;
    private T data;
}
