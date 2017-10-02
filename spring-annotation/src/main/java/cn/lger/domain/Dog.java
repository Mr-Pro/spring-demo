package cn.lger.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-16.
 */
//注册为Spring的Bean
@Component(value = "dog")
public class Dog {

    //注入值
    @Value(value = "旺财")
    private String name;
    @Value(value = "土狗")
    private String breed;
    @Value(value = "公")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
