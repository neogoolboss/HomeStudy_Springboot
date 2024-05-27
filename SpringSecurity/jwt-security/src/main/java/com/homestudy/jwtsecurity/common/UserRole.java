package com.homestudy.jwtsecurity.common;

public enum UserRole {

    User("USER"), ADMIN("ADMIN"), ALL("USER,ADMIN");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
