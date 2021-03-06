/**
 * Copyright (c) 2018. [Zexin Zhong]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions an limitations under the License.
 */

package com.sep.UniTrips.model.ImportCalendar;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UTSTimeTableServicesInterface {

    @FormUrlEncoded
    @POST("/aplus{year}/rest/student/login")
    Call<LoginBeans> login(
            @Path("year") String year,
            @Field("username") String username,
            @Field("password") String password
    );

    @GET("/aplus{year}/student")
    Call<ResponseBody> getResponseBody(
            @Path("year") String year,
            @Query("ss") String token,
            @Header("Cookie") String cookie
    );
}
