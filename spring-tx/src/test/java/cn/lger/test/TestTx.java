package cn.lger.test;

import cn.lger.service.TransferService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-27.
 */
public class TestTx {

    /**
     * 测试service的转账功能
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        TransferService service = context.getBean(TransferService.class);
        service.transferMoney();
    }
}
