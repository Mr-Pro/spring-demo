package cn.lger.proxy;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-20.
 */
public class Proxy {

    public void before(){
        System.out.println("代理人去被代理人家里牵狗，然后遛狗");
    }

    public void after(){
        System.out.println("代理人带狗狗回家");
    }

}
