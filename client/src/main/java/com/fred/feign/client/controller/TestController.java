package com.fred.feign.client.controller;

import com.fred.feign.client.feign.ServerFeignService;
import com.fred.feign.dto.UserDTO;
import com.fred.feign.vo.ROL;
import com.fred.feign.vo.ROO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2019/4/4
 */
@RestController
public class TestController {

    @Autowired
    private ServerFeignService serverFeignService;

    @GetMapping("/feign")
    public Object test() {
        ROO<UserDTO> test = serverFeignService.test();

        return test;
    }


    @GetMapping("/feign/list")
    public Object testList() {
        ROL<UserDTO> test = serverFeignService.testList();

        return test;
    }
}
