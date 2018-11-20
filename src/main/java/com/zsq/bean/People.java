package com.zsq.bean;

/**
 * @author zsq
 * @date 2018/11/20 - 20:32
 */
public class People {
    private String username;
    private String password;

    public People() {
    }

    public People(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return "People{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
