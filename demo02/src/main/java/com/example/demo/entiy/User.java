package com.example.demo.entiy;

import javax.persistence.*;

@Entity
@Table(name = "TEST")
public class User {

    @Id
    @Column(name = "ID")
    private String id;
    @Basic
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "SEX")
    private String sex;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "USER_AUTHORITY")
    private String user_Authority;


    public String getUser_Authority() {
        return user_Authority;
    }

    public void setUser_Authority(String user_Authority) {
        this.user_Authority = user_Authority;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
