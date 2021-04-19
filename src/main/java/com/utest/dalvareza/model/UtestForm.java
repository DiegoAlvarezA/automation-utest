package com.utest.dalvareza.model;

public class UtestForm {
    private String firstName;
    private String lastName;
    private String email;
    private String birthDate;
    private String language;
    private String city;
    private String zip;
    private String country;
    private String computerOs;
    private String computerVersion;
    private String computerLanguage;
    private String mobile;
    private String mobileModel;
    private String mobileOs;
    private String password;
    private boolean isCheckedTerms;
    private boolean isCheckedPrivacyPolicy;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate(String type) {
        String[] parts = birthDate.split("/");
        String result = "";
        switch(type) {
            case "month":
                result = parts[0];
                break;
            case "day":
                result = parts[1];
                break;
            case "year":
                result = parts[2];
                break;
            default:
                throw new IllegalStateException("Unexpected birthdate part: " + type);
        }
        return result;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComputerOs() {
        return computerOs;
    }

    public void setComputerOs(String computerOs) {
        this.computerOs = computerOs;
    }

    public String getComputerVersion() {
        return computerVersion;
    }

    public void setComputerVersion(String computerVersion) {
        this.computerVersion = computerVersion;
    }

    public String getComputerLanguage() {
        return computerLanguage;
    }

    public void setComputerLanguage(String computerLanguage) {
        this.computerLanguage = computerLanguage;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isCheckedTerms() {
        return isCheckedTerms;
    }

    public void setCheckedTerms(boolean checkedTerms) {
        isCheckedTerms = checkedTerms;
    }

    public boolean isCheckedPrivacyPolicy() {
        return isCheckedPrivacyPolicy;
    }

    public void setCheckedPrivacyPolicy(boolean checkedPrivacyPolicy) {
        isCheckedPrivacyPolicy = checkedPrivacyPolicy;
    }

    public String getMobileOs() {
        return mobileOs;
    }

    public void setMobileOs(String mobileOs) {
        this.mobileOs = mobileOs;
    }
}
