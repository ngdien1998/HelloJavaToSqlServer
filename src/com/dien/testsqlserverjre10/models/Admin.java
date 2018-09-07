package com.dien.testsqlserverjre10.models;

public class Admin {

    private String username;
    private String password;
    private String fullname;
    private String email;
    private String avatar;
    private boolean isAdmin;
    private boolean isAllowed;

    public Admin() {
    }

    public Admin(String username, String password, String fullname, String email, String avatar, boolean isAdmin, boolean isAllowed) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.avatar = avatar;
        this.isAdmin = isAdmin;
        this.isAllowed = isAllowed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean allowed) {
        isAllowed = allowed;
    }

    @Override
    public String toString() {
        return String.format("Username: %s, Password: %s, Fullname: %s, Email: %s, Avatar: %s, Is admin: %b. Is allowed: %b", username, password, fullname, email, avatar, isAdmin, isAllowed);
    }
}
