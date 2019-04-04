package com.fred.feign.server;

import com.fred.feign.dto.UserDTO;
import com.fred.feign.vo.ROO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 0.0.1
 * @since 2019/4/4
 */
@RestController
public class ServerController {

    @GetMapping("test")
    public ROO<UserDTO> test() {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("fred");
        userDTO.setAge(1);

        return new ROO<>(true, 200, "success", userDTO);
    }
}
