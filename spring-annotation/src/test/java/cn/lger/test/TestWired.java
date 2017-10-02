package cn.lger.test;

import cn.lger.domain.Man;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-30.
 */
//junit运行的时候就会加载 SpringJUnit4ClassRunner,
//SpringJUnit4ClassRunner是Spring test提供的主要是方便测试
@RunWith(SpringJUnit4ClassRunner.class)
//加载Spring 配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class TestWired {

    @Autowired
    private Man man;

    /**
     * 测试注解装配是否成功
     */
    @Test
    public void test01(){
        System.out.println(man);
    }

}
