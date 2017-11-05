package cn.lger;

import cn.lger.dao.UserDao;
import cn.lger.domain.User;
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
public class TestUserDao {

    @Resource
    private UserDao userDao;

    /**
     * 测试查询用户密码
     */
    @Test
    public void test01(){
        String password =  userDao.queryPasswordByUsername("tom");
        System.out.println(password);
        password =  userDao.queryPasswordByUsername("jack");
        System.out.println(password);
    }


    /**
     * 测试添加用户
     */
    @Test
    public void test02(){
        User user = new User();
        user.setUsername("john");
        user.setPassword("asd");
        System.out.println(userDao.addUser(user));
    }

}
