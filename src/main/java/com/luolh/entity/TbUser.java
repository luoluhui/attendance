package com.luolh.entity;

/**
 * created by luolh on 20180703
 */
public class TbUser {
    private long userId;

    private String username;

    private String passwords;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", passwords='" + passwords + '\'' +
                '}';
    }
}
