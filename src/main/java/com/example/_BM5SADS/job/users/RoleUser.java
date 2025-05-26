package com.example._BM5SADS.job.users;

public enum RoleUser {

    ADMIN("admin"),
    USER("user");

    private String role;

    RoleUser(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
