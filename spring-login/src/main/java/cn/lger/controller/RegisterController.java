package cn.lger.controller;

import cn.lger.dao.UserDao;
import cn.lger.domain.User;
import cn.lger.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-11-05.
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @Resource
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String regView(){
        return "register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String reg(User user){
        if (userService.regUser(user))
            return "success";
        return "error";
    }

}
