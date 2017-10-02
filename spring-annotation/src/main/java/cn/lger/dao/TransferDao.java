package cn.lger.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-27.
 */
@Component
public class TransferDao extends JdbcTemplate {

    /**
     * 将钱的数目转向当前user的账户
     * @param money money
     * @param username username
     */
    public void transferMoneyToOne(Float money, String username){
        this.update("UPDATE account SET money = money + (?) WHERE username = ?", money, username);
    }

    /**
     * 通过有参构造函数注入DataSource
     * @param dataSource dataSource
     */
    @Autowired
    public TransferDao(DataSource dataSource){
        //因为没用xml注入dataSource所以这里需要自己设置
        //调用超类的构造函数设置dataSource
        super(dataSource);
    }

}
