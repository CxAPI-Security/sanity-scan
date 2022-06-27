package com.sanity.scan.model;

public class User {
    private Long id;
    private String password;
    private String liame;
    private String info;
    private int height;


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLiame() {
        return liame;
    }

    public void setLiame(String liame) {
        this.liame = liame;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", liame='" + liame + '\'' +
                ", info='" + info + '\'' +
                ", height=" + height +
                '}';
    }
}
