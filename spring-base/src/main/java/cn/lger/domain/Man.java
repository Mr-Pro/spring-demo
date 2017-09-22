package cn.lger.domain;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-20.
 */
public class Man {

    private Dog dog;
    private Dog dog2;

    /**
     * 这里因为使用了有参的构造函数，所以需要写入无参构造函数
     */
    public Man(){

    }

    public Man(Dog dog) {
        this.dog2 = dog;
    }

    public void noFreeTime(){
        System.out.println("狗主人（被代理人）上班了");
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void walkTheDog(){
        System.out.println("遛"+dog.getName());
        System.out.println("遛"+dog2.getName());
    }

}
