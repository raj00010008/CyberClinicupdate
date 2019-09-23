package com.example.cyberclinic.Api;

import com.example.cyberclinic.model.UserData;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface ApiUserService {
    @FormUrlEncoded
    @POST("/user/register-user")
    Call<UserData.Data> post(
//                          @Field("email") String email,
//                          @Field("name") String name,
//                          @Field("lastname") String lastname,
//                          @Field("password") String password,
            @Field("user_type") String user_type
//                          ,@Field("time_zone") String time_zone,
//                          @Field("mobileno") String mobileno,
//                          @Field("appIdFacebook") String appIdFacebook,
//                          @Field("appIdGoogle") String appIdGoogle,
//                          @Field("profile_pic") String profile_pic,
//                          @Field("address") String address,
//                          @Field("gender") Boolean gender,
//                          @Field("id") String id,
//                          @Field("dob") String dob,
//                          @Field("contracktKey") String contracktKey
    );
    @FormUrlEncoded
    @POST("/CyberClinic//user/login")
    Call<UserData.Data> loginUser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("appIdFacebook") String appIdFacebook,
            @Field("appIdGoogle") String appIdGoogle,
            @Field("gcm_id") String gcm_id
    );
}
