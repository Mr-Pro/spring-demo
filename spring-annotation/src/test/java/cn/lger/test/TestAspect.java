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
 * Created by Pro on 2017-10-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAspect {

    @Autowired
    private Man man;

    @Test
    public void test01(){
        man.noFreeTime();
    }

}
