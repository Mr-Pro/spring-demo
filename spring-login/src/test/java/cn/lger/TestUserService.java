package cn.lger;

import cn.lger.domain.User;
import cn.lger.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-11-05.
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestUserService {

    @Resource
    private UserService userService;

    /**
     * 测试注册用户
     */
    @Test
    public void test01(){
        User user = new User();
        user.setUsername("john");
        user.setPassword("asd");
        System.out.println(userService.regUser(user));

    }
}
