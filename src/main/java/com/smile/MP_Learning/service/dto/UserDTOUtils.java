package com.smile.MP_Learning.service.dto;

import com.smile.MP_Learning.controller.vo.UserVO;

/**
 * @author smi1e
 * Date 2019/11/6 14:31
 * Description
 */
public class UserDTOUtils {
    public static UserVO userDTO2VO(UserDTO userDTO){
        UserVO userVO = new UserVO();
        userVO.setName(userDTO.getName());
        userVO.setAge(userDTO.getAge());
        return userVO;
    }
}
