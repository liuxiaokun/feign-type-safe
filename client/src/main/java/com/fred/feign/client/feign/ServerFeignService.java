package com.fred.feign.client.feign;

import com.fred.feign.dto.UserDTO;
import com.fred.feign.vo.ROL;
import com.fred.feign.vo.ROO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2019/4/4
 */
@FeignClient("server")
public interface ServerFeignService {

    @GetMapping("test")
    ROO<UserDTO> test();


    @GetMapping("test/list")
    ROL<UserDTO> testList();
}
