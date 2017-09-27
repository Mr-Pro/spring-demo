package cn.lger.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-27.
 */
@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestGetDataSource {

    @Resource(name = "dataSource")
    private DataSource dataSource;

    /**
     * 测试是否能够正确获取DataSource
     */
    @Test
    public void test01(){
        System.out.println(dataSource);
    }

}
