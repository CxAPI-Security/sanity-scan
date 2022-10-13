package com.sanity.scan.model;

public class City {
    private String name;
    private String mayor;
    private int age;

    public City(String name, String mayor, int age) {
        this.name = name;
        this.mayor = mayor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", mayor='" + mayor + '\'' +
                ", age=" + age +
                '}';
    }
}
