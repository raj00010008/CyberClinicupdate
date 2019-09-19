package com.example.cyberclinic.model;

import com.google.gson.annotations.SerializedName;

public class UserData {
    private Data data;
    private String status;

    public class Data {
        private Address address;
        @SerializedName("contractKey")
        private String contractKey;
        @SerializedName("gender")
        private String gender;
        @SerializedName("creationTime")
        private float creationTime;
        @SerializedName("countrycode")
        private String countrycode;
        @SerializedName("pushkit_device_id")
        private String pushkit_device_id;
        @SerializedName("rating")
        private String rating;
        @SerializedName("is_removed")
        private boolean is_removed;
        @SerializedName("mobileno")
        private String mobileno;
        @SerializedName("password")
        private String password;
        @SerializedName("user_type")
        private String user_type;
        @SerializedName("is_deleted")
        private boolean is_deleted;
        @SerializedName("gcmId")
        private String gcmId;
        @SerializedName("appIdFacebook")
        private String appIdFacebook;
        @SerializedName("null")
        private String ratings;
        @SerializedName("intake_form")
        private String intake_form;
        @SerializedName("customerId")
        private String customerId;
        @SerializedName("id")
        private float id;
        @SerializedName("updation_time")
        private float updation_time;
        @SerializedName("lastAppointment")
        private String lastAppointment;
        @SerializedName("email")
        private String email;
        @SerializedName("appIdGoogle")
        private String appIdGoogle;
        @SerializedName("device_id")
        private String device_id;
        @SerializedName("address_id")
        private float address_id;
        @SerializedName("profile_pic")
        private String profile_pic;
        @SerializedName("time_zone")
        private String time_zone;
        @SerializedName("lastname")
        private String lastname;
        @SerializedName("peas_survey_pending")
        private boolean peas_survey_pending;
        @SerializedName("dob")
        private String dob;
        @SerializedName("third_party_app")
        private boolean third_party_app;
        @SerializedName("name")
        private String name;

        public String getContractKey() {
            return contractKey;
        }

        public void setContractKey(String contractKey) {
            this.contractKey = contractKey;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public float getCreationTime() {
            return creationTime;
        }

        public void setCreationTime(float creationTime) {
            this.creationTime = creationTime;
        }

        public String getCountrycode() {
            return countrycode;
        }

        public void setCountrycode(String countrycode) {
            this.countrycode = countrycode;
        }

        public String getPushkit_device_id() {
            return pushkit_device_id;
        }

        public void setPushkit_device_id(String pushkit_device_id) {
            this.pushkit_device_id = pushkit_device_id;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public boolean isIs_removed() {
            return is_removed;
        }

        public void setIs_removed(boolean is_removed) {
            this.is_removed = is_removed;
        }

        public String getMobileno() {
            return mobileno;
        }

        public void setMobileno(String mobileno) {
            this.mobileno = mobileno;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getUser_type() {
            return user_type;
        }

        public void setUser_type(String user_type) {
            this.user_type = user_type;
        }

        public boolean isIs_deleted() {
            return is_deleted;
        }

        public void setIs_deleted(boolean is_deleted) {
            this.is_deleted = is_deleted;
        }

        public String getGcmId() {
            return gcmId;
        }

        public void setGcmId(String gcmId) {
            this.gcmId = gcmId;
        }

        public String getAppIdFacebook() {
            return appIdFacebook;
        }

        public void setAppIdFacebook(String appIdFacebook) {
            this.appIdFacebook = appIdFacebook;
        }

        public String getRatings() {
            return ratings;
        }

        public void setRatings(String ratings) {
            this.ratings = ratings;
        }

        public String getIntake_form() {
            return intake_form;
        }

        public void setIntake_form(String intake_form) {
            this.intake_form = intake_form;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public float getId() {
            return id;
        }

        public void setId(float id) {
            this.id = id;
        }

        public float getUpdation_time() {
            return updation_time;
        }

        public void setUpdation_time(float updation_time) {
            this.updation_time = updation_time;
        }

        public String getLastAppointment() {
            return lastAppointment;
        }

        public void setLastAppointment(String lastAppointment) {
            this.lastAppointment = lastAppointment;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAppIdGoogle() {
            return appIdGoogle;
        }

        public void setAppIdGoogle(String appIdGoogle) {
            this.appIdGoogle = appIdGoogle;
        }

        public String getDevice_id() {
            return device_id;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }

        public float getAddress_id() {
            return address_id;
        }

        public void setAddress_id(float address_id) {
            this.address_id = address_id;
        }

        public String getProfile_pic() {
            return profile_pic;
        }

        public void setProfile_pic(String profile_pic) {
            this.profile_pic = profile_pic;
        }

        public String getTime_zone() {
            return time_zone;
        }

        public void setTime_zone(String time_zone) {
            this.time_zone = time_zone;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public boolean isPeas_survey_pending() {
            return peas_survey_pending;
        }

        public void setPeas_survey_pending(boolean peas_survey_pending) {
            this.peas_survey_pending = peas_survey_pending;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public boolean isThird_party_app() {
            return third_party_app;
        }

        public void setThird_party_app(boolean third_party_app) {
            this.third_party_app = third_party_app;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public class Address {
            @SerializedName("creation_time")
            private String creation_time;
            @SerializedName("country")
            private String country;
            @SerializedName("city")
            private String city;
            @SerializedName("user_address")
            private String user_address;
            @SerializedName("lon")
            private float lon;
            @SerializedName("user_type")
            private String user_type;
            @SerializedName("user_id")
            private String user_id;
            @SerializedName("postalcode")
            private String postalcode;
            @SerializedName("suburb")
            private String suburb;
            @SerializedName("location")
            private String location;
            @SerializedName("id")
            private float id;
            @SerializedName("state")
            private String state;
            @SerializedName("lat")
            private float lat;

            public String getCreation_time() {
                return creation_time;
            }

            public void setCreation_time(String creation_time) {
                this.creation_time = creation_time;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getUser_address() {
                return user_address;
            }

            public void setUser_address(String user_address) {
                this.user_address = user_address;
            }

            public float getLon() {
                return lon;
            }

            public void setLon(float lon) {
                this.lon = lon;
            }

            public String getUser_type() {
                return user_type;
            }

            public void setUser_type(String user_type) {
                this.user_type = user_type;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getPostalcode() {
                return postalcode;
            }

            public void setPostalcode(String postalcode) {
                this.postalcode = postalcode;
            }

            public String getSuburb() {
                return suburb;
            }

            public void setSuburb(String suburb) {
                this.suburb = suburb;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public float getId() {
                return id;
            }

            public void setId(float id) {
                this.id = id;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public float getLat() {
                return lat;
            }

            public void setLat(float lat) {
                this.lat = lat;
            }
        }

    }

}
