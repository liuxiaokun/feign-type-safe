package com.fred.feign.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2019/4/4
 */
@Data
@AllArgsConstructor
public class ROL<T> {

    private boolean success;
    private int code;
    private String message;
    private List<T> data;

}
