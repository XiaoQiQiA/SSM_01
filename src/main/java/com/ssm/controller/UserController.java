package com.ssm.controller;

import com.ssm.bean.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 侯文远
 * @version V1.0
 * @Package com.ssm.controller
 * @date 2019/11/7 17:24
 * @Copyright © 2016-2017 奥琦玮信息科技（北京）有限公司
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "impl")
    private IUserService iUserService;

    public String getUserListPage(Model model){

        List<User> list = iUserService.list();
        model.addAttribute("list",list);

        return "user_list";
    }

    @RequestMapping("/deleteById")
    public String deleteById(Integer id) {
        System.out.println(id);
        int n = iUserService.deleteById(id);
        if(n == 1) {
            System.out.println("ɾ���ɹ�");
        }else {
            System.out.println("ɾ��ʧ��");
        }
        return "redirect:/user/getUserListPage.action";
    }

    @RequestMapping("/getUseraddPage")
    public String getUseraddPage() {
        return "user_add";
    }

    @RequestMapping("/add")
    public String add(User user) {
        int count = iUserService.add(user);
        System.out.println(count);
        return "redirect:/user/getUserListPage.action";
    }

}
