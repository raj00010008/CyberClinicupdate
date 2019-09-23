package com.example.cyberclinic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("appIdFacebook")
    @Expose
    private String appIdFacebook;

    @SerializedName("appIdGoogle")
    @Expose
    private String appIdGoogle;

    @SerializedName("gcm_id")
    @Expose
    private String gcm_id;

    public User(String email, String password, String appIdFacebook, String appIdGoogle, String gcm_id) {
        this.email = email;
        this.password = password;
        this.appIdFacebook = appIdFacebook;
        this.appIdGoogle = appIdGoogle;
        this.gcm_id = gcm_id;
    }

    public String getPassword() {
        return password;
    }

    public String getAppIdFacebook() {
        return appIdFacebook;
    }

    public String getAppIdGoogle() {
        return appIdGoogle;
    }

    public String getGcm_id() {
        return gcm_id;
    }

    public String getEmail() {
        return email;
    }

}
