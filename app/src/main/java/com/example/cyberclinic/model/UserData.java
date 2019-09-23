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

        public String getGender() {
            return gender;
        }

        public float getCreationTime() {
            return creationTime;
        }

        public String getCountrycode() {
            return countrycode;
        }

        public String getPushkit_device_id() {
            return pushkit_device_id;
        }

        public String getRating() {
            return rating;
        }

        public boolean isIs_removed() {
            return is_removed;
        }

        public String getMobileno() {
            return mobileno;
        }

        public String getPassword() {
            return password;
        }

        public String getUser_type() {
            return user_type;
        }

        public boolean isIs_deleted() {
            return is_deleted;
        }

        public String getGcmId() {
            return gcmId;
        }

        public String getAppIdFacebook() {
            return appIdFacebook;
        }

        public String getRatings() {
            return ratings;
        }

        public String getIntake_form() {
            return intake_form;
        }

        public String getCustomerId() {
            return customerId;
        }

        public float getId() {
            return id;
        }

        public float getUpdation_time() {
            return updation_time;
        }

        public String getLastAppointment() {
            return lastAppointment;
        }

        public String getEmail() {
            return email;
        }

        public String getAppIdGoogle() {
            return appIdGoogle;
        }

        public String getDevice_id() {
            return device_id;
        }

        public float getAddress_id() {
            return address_id;
        }

        public String getProfile_pic() {
            return profile_pic;
        }

        public String getTime_zone() {
            return time_zone;
        }

        public String getLastname() {
            return lastname;
        }

        public boolean isPeas_survey_pending() {
            return peas_survey_pending;
        }

        public String getDob() {
            return dob;
        }

        public boolean isThird_party_app() {
            return third_party_app;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Data(Address address, String contractKey, String gender, float creationTime, String countrycode, String pushkit_device_id, String rating, boolean is_removed, String mobileno, String password, String user_type, boolean is_deleted, String gcmId, String appIdFacebook, String ratings, String intake_form, String customerId, float updation_time, String lastAppointment, String email, String appIdGoogle, String device_id, float address_id, String profile_pic, String time_zone, String lastname, boolean peas_survey_pending, String dob, boolean third_party_app, String name) {
            this.address = address;
            this.contractKey = contractKey;
            this.gender = gender;
            this.creationTime = creationTime;
            this.countrycode = countrycode;
            this.pushkit_device_id = pushkit_device_id;
            this.rating = rating;
            this.is_removed = is_removed;
            this.mobileno = mobileno;
            this.password = password;
            this.user_type = user_type;
            this.is_deleted = is_deleted;
            this.gcmId = gcmId;
            this.appIdFacebook = appIdFacebook;
            this.ratings = ratings;
            this.intake_form = intake_form;
            this.customerId = customerId;
            this.updation_time = updation_time;
            this.lastAppointment = lastAppointment;
            this.email = email;
            this.appIdGoogle = appIdGoogle;
            this.device_id = device_id;
            this.address_id = address_id;
            this.profile_pic = profile_pic;
            this.time_zone = time_zone;
            this.lastname = lastname;
            this.peas_survey_pending = peas_survey_pending;
            this.dob = dob;
            this.third_party_app = third_party_app;
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

            public String getCity() {
                return city;
            }

            public String getUser_address() {
                return user_address;
            }

            public float getLon() {
                return lon;
            }

            public String getUser_type() {
                return user_type;
            }

            public String getUser_id() {
                return user_id;
            }

            public String getPostalcode() {
                return postalcode;
            }

            public String getSuburb() {
                return suburb;
            }

            public String getLocation() {
                return location;
            }

            public String getState() {
                return state;
            }

            public float getLat() {
                return lat;
            }

            public float getId() {
                return id;
            }

            public void setId(float id) {
                this.id = id;
            }

            public Address(String creation_time, String country, String city, String user_address, float lon, String user_type, String user_id, String postalcode, String suburb, String location, String state, float lat) {
                this.creation_time = creation_time;
                this.country = country;
                this.city = city;
                this.user_address = user_address;
                this.lon = lon;
                this.user_type = user_type;
                this.user_id = user_id;
                this.postalcode = postalcode;
                this.suburb = suburb;
                this.location = location;
                this.state = state;
                this.lat = lat;
            }
        }

    }

}
