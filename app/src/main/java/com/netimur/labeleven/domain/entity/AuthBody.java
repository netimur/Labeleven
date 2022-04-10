package com.netimur.labeleven.domain.entity;

public class AuthBody {
    private String login;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public AuthBody(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private String password;

    @Override
    public String toString() {
        return "AuthBody{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
