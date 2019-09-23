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

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public String getAddress() {
        return address;
    }

    public boolean isGender() {
        return gender;
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

    public int getContracktKey() {
        return contracktKey;
    }

    public Number getMobileno() {
        return mobileno;
    }

    public String getAppIdFacebook() {
        return appIdFacebook;
    }

    public String getAppIdGoogle() {
        return appIdGoogle;
    }

    public UserDetail(String email, String name, String lastname, String password, String time_zone, String profile_pic, String address, boolean gender, int dob, int contracktKey, Number mobileno, String appIdFacebook, String appIdGoogle) {
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.time_zone = time_zone;
        this.profile_pic = profile_pic;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.contracktKey = contracktKey;
        this.mobileno = mobileno;
        this.appIdFacebook = appIdFacebook;
        this.appIdGoogle = appIdGoogle;
    }
}
