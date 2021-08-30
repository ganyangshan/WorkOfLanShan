package com.example.demoex.bean;

import org.apache.ibatis.annotations.Mapper;


public class User {
    private String name;
    private String sex;
    private String background;
    private String hobby;
    private String password;
    public User() {
    }
    public User(String name, String sex, String background, String hobby, String password) {
        this.name = name;
        this.sex = sex;
        this.background = background;
        this.hobby = hobby;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", background='" + background + '\'' +
                ", hobby='" + hobby + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
