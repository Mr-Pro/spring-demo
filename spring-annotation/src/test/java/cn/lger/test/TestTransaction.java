package cn.lger.test;

import cn.lger.service.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-10-02.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTransaction {

    @Autowired
    private TransferService transferService;

    /**
     * 测试转账事务
     */
    @Test
    public void test01(){
        transferService.transferMoney();
    }
}
