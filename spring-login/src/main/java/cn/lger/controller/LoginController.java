package cn.lger.controller;

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
@RequestMapping("/login")
public class LoginController {

    @Resource
    private UserService userService;

    /**
     * 返回登录页面
     * @return register.jsp
     */
    @RequestMapping(method = RequestMethod.GET)
    public String loginView(){
        return "login";
    }

    /**
     * 用户登录
     * @param user user
     * @return 返回视图（jsp）
     */
    @RequestMapping(method = RequestMethod.POST)
    public String login(User user){
        if (user.getPassword().equals(userService.queryPasswordByUsername(user.getUsername()))){
            return "success";
        }
        return "error";
    }

}
