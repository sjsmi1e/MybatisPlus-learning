package com.smile.MP_Learning.service;

import com.smile.MP_Learning.mapper.bo.User;
import com.smile.MP_Learning.service.dto.UserDTO;

/**
 * @author smi1e
 * Date 2019/11/6 14:12
 * Description
 */
public interface UserService {
    UserDTO findUserById(Integer id);
    Integer addUser(User user);
}
