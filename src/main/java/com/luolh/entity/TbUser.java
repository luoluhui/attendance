package com.luolh.entity;

/**
 * created by luolh on 20180703
 */
public class TbUser {
    private long userId;

    private String username;

    private String passwords;

    private String realName;

    private String headImage;

    private String phone;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", passwords='" + passwords + '\'' +
                ", realName='" + realName + '\'' +
                ", headImage='" + headImage + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
