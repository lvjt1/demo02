//package com.example.demo.entiy;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//@Entity
//public class Authority {
//
//    @Id
//    @NotNull
//    @Size(min = 0, max = 50)
//    private String name;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_Authority")
//    private User user;
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Authority authority = (Authority) o;
//
//        if (!name.equals(authority.name)) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "Authority{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//}
