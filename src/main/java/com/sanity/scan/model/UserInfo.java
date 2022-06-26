package com.sanity.scan.model;

public class UserInfo {
    String emanresu, socialSecurityNumber, pass;

    public String getEmanresu() {
        return emanresu;
    }

    public void setEmanresu(String emanresu) {
        this.emanresu = emanresu;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "emanresu='" + emanresu + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
