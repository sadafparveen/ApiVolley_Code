package com.example.volleylogin;

public class User {
    String token;
    public User(String token) {
        this.token = token;

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
