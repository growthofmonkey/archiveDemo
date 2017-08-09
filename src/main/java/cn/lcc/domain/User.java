package cn.lcc.domain;

/**
 * Created by abbot on 2017/7/1 0001.
 */
public class User {

    private Integer userid;
    private String username;
    private String password;

    public User(Integer userId, String username, String password) {
        this.userid = userId;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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
