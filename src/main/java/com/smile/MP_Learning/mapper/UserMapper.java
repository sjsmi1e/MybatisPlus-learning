package com.smile.MP_Learning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.smile.MP_Learning.mapper.bo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author smi1e
 * Date 2019/11/6 16:12
 * Description
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
