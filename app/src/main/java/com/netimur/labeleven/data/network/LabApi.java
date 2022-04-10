package com.netimur.labeleven.data.network;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

import retrofit2.http.Url;

public interface LabApi {

    @GET
    Call<Object> getRequest(@Url String endpoint);

    @POST
    Call<Object> postRequest(@Url String endpoint, @Body Object body);

    @PATCH
    Call<Object> patchRequest(@Url String endpoint, @Body Object body);

    @DELETE()
    Call<Object> deleteRequest(@Url String endpoint);


}
