package com.sanity.scan.model;

import java.io.Serializable;

public class Country implements Serializable {

    private static final long serialVersionUID = 6272322277225983387L;
    public static final int NUM_OF_CONTINENTS = 7;

    private int id;
    private final String countryName;
    private final String definition = "A country is a distinct part of the world";
    private static String a2;
    private String a3;
    private volatile String phoneCode;
    private transient String displayName;
    private volatile transient String gmtOffset;
    private GovernmentForm governmentForm;
    private String language;

    public Country(int id, String countryName, String a3, String phoneCode, String displayName, String gmtOffset,
                   GovernmentForm governmentForm, String language) {
        this.id = id;
        this.countryName = countryName;
        this.a3 = a3;
        this.phoneCode = phoneCode;
        this.displayName = displayName;
        this.gmtOffset = gmtOffset;
        this.governmentForm = governmentForm;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getDefinition() {
        return definition;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        Country.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getGmtOffset() {
        return gmtOffset;
    }

    public void setGmtOffset(String gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    public GovernmentForm getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(GovernmentForm governmentForm) {
        this.governmentForm = governmentForm;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                ", definition='" + definition + '\'' +
                ", a3='" + a3 + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", displayName='" + displayName + '\'' +
                ", gmtOffset='" + gmtOffset + '\'' +
                ", governmentForm=" + governmentForm +
                ", language='" + language + '\'' +
                '}';
    }
}