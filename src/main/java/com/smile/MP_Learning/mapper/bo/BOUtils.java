package com.smile.MP_Learning.mapper.bo;

import com.smile.MP_Learning.service.dto.UserDTO;

/**
 * @author smi1e
 * Date 2019/11/6 14:15
 * Description
 */
public class BOUtils {
    public static UserDTO userBO2DTO(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setAge(user.getAge());
        return userDTO;
    }
}
