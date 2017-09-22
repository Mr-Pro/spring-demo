package cn.lger.test;

import cn.lger.domain.Man;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-20.
 */
public class TestProxy {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Man man = context.getBean(Man.class);
        man.noFreeTime();
    }
}
