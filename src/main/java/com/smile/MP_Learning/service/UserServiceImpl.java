package com.smile.MP_Learning.service;

import com.smile.MP_Learning.mapper.UserMapper;
import com.smile.MP_Learning.mapper.bo.BOUtils;
import com.smile.MP_Learning.mapper.bo.User;
import com.smile.MP_Learning.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author smi1e
 * Date 2019/11/6 14:13
 * Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDTO findUserById(Integer id) {
        User user = userMapper.selectById(id);
        UserDTO userDTO = BOUtils.userBO2DTO(user);
        return userDTO;
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.insert(user);
    }


}
