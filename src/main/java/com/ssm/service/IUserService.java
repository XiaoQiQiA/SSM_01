package com.ssm.service;

import com.ssm.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王聪
 * @version V1.0
 * @Package com.ssm.service.impl
 * @date 2019/11/7 17:21
 * @Copyright © 2016-2017 奥琦玮信息科技（北京）有限公司
 */

public interface IUserService {

    public List<User> list();

    public int deleteById(Integer id);

    public int add(User user);

}
