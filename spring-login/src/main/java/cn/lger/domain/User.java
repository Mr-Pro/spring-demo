package cn.lger.domain;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-11-05.
 */
public class User {

    private Integer uId;
    private String username;
    private String password;
    private float money;

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
