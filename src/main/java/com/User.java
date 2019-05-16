package com;

public class User {
    public String username;
    public int age;
    public float high;
    public String hobby;

    public User() {

    }

    public User(String username, int age, float high, String hobby) {
        this.username = username;
        this.age = age;
        this.high = high;
        this.hobby = hobby;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public float getHigh() {
        return high;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public String getUsername() {
        return username;
    }

    public String toString() {
        return this.username;
    }
}
