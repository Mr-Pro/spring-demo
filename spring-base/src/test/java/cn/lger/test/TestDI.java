package cn.lger.test;

import cn.lger.domain.Dog;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-16.
 */

public class TestDI {

    /**
     * 一般的类的创建--new
     */
    @Test
    public void test01(){
        Dog dog = new Dog();//这里就产生了耦合
        dog.setSex("公");
        dog.setName("旺旺");
        dog.setBreed("土狗");
        System.out.println(dog);
    }

    /**
     * 通过ClassPathXmlApplicationContext获取bean-->dog
     */
    @Test
    public void test02(){
        //新建一个ClassPathXmlApplicationContext类型对象，并且加载xml文件
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //通过bean的类型加载一个Dog类型对象
        Dog dog = applicationContext.getBean(Dog.class);
        //打印测试
        System.out.println(dog);
    }



}
