package cn.lger.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-30.
 */
@Component(value = "man")
public class Man extends Human{

    @Value(value = "张三")
    private String name;

    @Autowired
    private Dog dog;

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String myNameIs() {
        return name;
    }

    public void noFreeTime(){
        System.out.println("狗主人没有时间(public void noFreeTime())");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
