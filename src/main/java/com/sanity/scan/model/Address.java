package com.sanity.scan.model;

public class Address {
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
