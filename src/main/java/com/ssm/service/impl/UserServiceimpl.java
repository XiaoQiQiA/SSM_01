package com.ssm.service.impl;

import com.ssm.bean.User;
import com.ssm.dao.UserMapper;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author wc
 * @version V1.0
 * @Package com.ssm.service
 * @date 2019/11/7 17:28
 * @Copyright © 2016-2017 奥琦玮信息科技（北京）有限公司
 */
@Service
public class UserServiceimpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    public List<User> list() {
        return userMapper.list();
    }


    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }


    public int add(User user) {
        return userMapper.add(user);
    }
}
