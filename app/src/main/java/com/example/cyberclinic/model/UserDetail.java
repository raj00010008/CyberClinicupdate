package com.example.cyberclinic.model;

public class UserDetail {
     private String email;
     private String name;
     private String lastname;
     private String password;
     private String time_zone;
     private String profile_pic;
     private String address;
     private boolean gender;
     private int id;
     private int dob;
     private int contracktKey;
     private Number mobileno;
     private String appIdFacebook;
     private String appIdGoogle;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getContracktKey() {
        return contracktKey;
    }

    public void setContracktKey(int contracktKey) {
        this.contracktKey = contracktKey;
    }

    public Number getMobileno() {
        return mobileno;
    }

    public void setMobileno(Number mobileno) {
        this.mobileno = mobileno;
    }

    public String getAppIdFacebook() {
        return appIdFacebook;
    }

    public void setAppIdFacebook(String appIdFacebook) {
        this.appIdFacebook = appIdFacebook;
    }

    public String getAppIdGoogle() {
        return appIdGoogle;
    }

    public void setAppIdGoogle(String appIdGoogle) {
        this.appIdGoogle = appIdGoogle;
    }
}
