package cn.lger.dao;

import cn.lger.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-11-05.
 */
@Repository
public class UserDao extends JdbcTemplate {

    /**
     * 注入数据源dataSource
     * @param dataSource 数据源
     */
    @Autowired
    public UserDao(DataSource dataSource){
        super(dataSource);
    }

    /**
     * 根据用户名返回密码
     * @param username username
     * @return password
     */
    public String queryPasswordByUsername(final String username){
        SqlRowSet set = this.queryForRowSet("SELECT password FROM user WHERE username = ?", username);
        if (set.next()){
            return set.getString("password");
        }
        return null;
    }

    /**
     * 添加用户
     * @param user user
     * @return 添加成功返回>0 的数 失败0
     */
    public int addUser(User user){
        return this.update("INSERT INTO user(username, password) VALUES (?, ?)", user.getUsername(), user.getPassword());
    }

    /**
     * 添加用户的钱
     * @param money 钱的数目
     * @param username 用户名
     * @return 添加成功返回>0 的数 失败0
     */
    public int addMoney(final float money, final String username){
        return this.update("UPDATE user SET money = ? WHERE username = ?", money, username);
    }

}
