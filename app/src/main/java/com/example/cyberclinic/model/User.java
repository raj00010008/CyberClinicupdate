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



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getGcm_id() {
        return gcm_id;
    }

    public void setGcm_id(String gcm_id) {
        this.gcm_id = gcm_id;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
