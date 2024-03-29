package com.lj.community.dto;

import org.springframework.stereotype.Component;

@Component
public class GithubUser {
    private String id;
    private String login;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
