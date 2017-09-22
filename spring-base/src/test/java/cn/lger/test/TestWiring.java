package cn.lger.test;

import cn.lger.domain.Man;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-21.
 */
public class TestWiring {

    /**
     * 测试通过xml文件装配Bean到Man类
     */
     @Test
    public void test01(){
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Man man = applicationContext.getBean(Man.class);
        man.walkTheDog();
    }


}
