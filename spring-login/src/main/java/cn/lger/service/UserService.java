package cn.lger.service;

import cn.lger.dao.UserDao;
import cn.lger.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-11-05.
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;


    public String queryPasswordByUsername(final String username){
        return userDao.queryPasswordByUsername(username);
    }

    /**
     * 注册用户
     * @param user user
     * @return 是否注册成功
     */

    @Transactional
    public boolean regUser(User user){
        if (userDao.addUser(user) != 0){
            userDao.addMoney(10, user.getUsername());
            return true;
        }
        return false;
    }


}
