package com.example.demo1.entity;

public class userentity {
    private String username;
    private int age;

    public userentity(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
