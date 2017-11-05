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

    @Autowired
    public UserDao(DataSource dataSource){
        super(dataSource);
    }

    public String queryPasswordByUsername(final String username){
        SqlRowSet set = this.queryForRowSet("SELECT password FROM user WHERE username = ?", username);
        if (set.next()){
            return set.getString("password");
        }
        return null;
    }

    public int addUser(User user){
        return this.update("INSERT INTO user(username, password) VALUES (?, ?)", user.getUsername(), user.getPassword());
    }

    public int addMoney(final float money, final String username){
        return this.update("UPDATE user SET money = ? WHERE username = ?", money, username);
    }

}
