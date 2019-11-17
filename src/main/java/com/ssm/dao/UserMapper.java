package com.ssm.dao;

import com.ssm.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 侯文远
 * @version V1.0
 * @Package com.ssm.dao
 * @date 2019/11/7 17:25
 * @Copyright © 2016-2017 奥琦玮信息科技（北京）有限公司
 */
@Repository
public interface UserMapper {

    public List<User> list();

    public int deleteById(Integer id);

    public int add(User user);
}
