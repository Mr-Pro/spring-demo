package cn.lger.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-27.
 */

public class TransferDao extends JdbcTemplate {

    /**
     * 将钱的数目转向当前user的账户
     * @param money money
     * @param username username
     */
    public void transferMoneyToOne(Float money, String username){
        this.update("UPDATE account SET money = money + (?) WHERE username = ?", money, username);
    }
}
