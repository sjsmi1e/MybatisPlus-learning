package com.smile.MP_Learning.controller;


import com.smile.MP_Learning.controller.vo.UserVO;
import com.smile.MP_Learning.mapper.bo.User;
import com.smile.MP_Learning.service.UserService;
import com.smile.MP_Learning.service.dto.UserDTO;
import com.smile.MP_Learning.service.dto.UserDTOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author smi1e
 * Date 2019/11/6 14:18
 * Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserById")
    public UserVO getUserById(Integer id) throws Exception {
        if (id == null) {
            throw new Exception("id must not null but id is null now!");
        }
        UserDTO userDTO = userService.findUserById(id);
        UserVO userVO = UserDTOUtils.userDTO2VO(userDTO);
        return userVO;
    }

    @PostMapping("/addUser")
    public String getUserById(String name, Integer age) throws Exception {
        if (name == null || "".equals(name)) {
            throw new Exception("name must be not null but name is null now!");
        }
        if (age == null) {
            throw new Exception("name must be not null but name is null now!");
        }
        User user = new User();
        user.setAge(age);
        user.setName(name);
        Integer result = userService.addUser(user);
        return String.valueOf(result);
    }
}
