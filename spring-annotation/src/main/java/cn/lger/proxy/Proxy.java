package cn.lger.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-20.
 */
@Aspect
//这里必须注册为Spring的Bean，虽然有了Aspect
//但是需要Spring调用这个切面还是需要注册为Spring的组件
@Component
public class Proxy {

    @Pointcut("execution(* cn.lger.domain.Man.noFreeTime())")
    public void noFreeTime(){}

    @Before(value = "noFreeTime()")
    public void before(){
        System.out.println("代理人去被代理人家里牵狗，然后遛狗");
    }

    @After(value = "noFreeTime()")
    public void after(){
        System.out.println("代理人带狗狗回家");
    }


}
