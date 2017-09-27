package cn.lger.test;

import cn.lger.dao.TransferDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-27.
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestTransferDao {

    @Autowired
    private TransferDao transferDao;
    /**
     * 测试dao转账功能
     */
    @Test
    public void test01(){
        transferDao.transferMoneyToOne((float) -53, "李四");
    }

}
