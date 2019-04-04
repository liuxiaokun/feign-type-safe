package com.fred.feign.server;

import com.fred.feign.dto.UserDTO;
import com.fred.feign.vo.ROL;
import com.fred.feign.vo.ROO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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


    @GetMapping("test/list")
    public ROL<UserDTO> testList() {

        List<UserDTO> result = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setName("fred");
        userDTO.setAge(1);

        result.add(userDTO);
        result.add(userDTO);
        result.add(userDTO);
        result.add(userDTO);

        return new ROL<>(true, 200, "success", result);
    }
}
