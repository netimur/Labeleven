package com.netimur.labeleven.utils;


import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.netimur.labeleven.domain.entity.Element;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public final class ResponseHandler<Object> implements Callback<Object> {

    private final ResponseCallback<Object> callback;

    public ResponseHandler(ResponseCallback<Object> callback) {
        this.callback = callback;
    }

    @Override
    public void onResponse(Call<Object> call, Response<Object> response) {
        Log.d("MyTag", "onResponse() invoked");
        //Log.d("MyTag", response.body().toString());
        handleResponse(callback, response);
    }



    @Override
    public void onFailure(Call<Object> call, Throwable t) {
        Log.d("MyTag", t.toString());
        Log.d("MyTag", "onFailure() invoked");
        Log.d("MyTag", call.request().toString() + call.request().body());
        callback.onError();
    }

    public void handleResponse(ResponseCallback<Object> callback, Response<Object> response) {
        Log.d("MyTag", "handleResponse() invoked");
        if (response.isSuccessful()) {

            callback.onSuccess(response.body());
            //Log.d("MyTag", "response:" + response.body().toString());
            ObjectMapper objectMapper = new ObjectMapper();

            CollectionType collectionType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Element.class);
            try {
                Log.d("MyTag", "Response parsed by objectMapper + collectionType" + objectMapper.readValue(response.toString(), collectionType));
            } catch (IOException e) {
                Log.d("MyTag", e.toString());

            }


        } else {
            Log.d("MyTag", response.errorBody().toString());
            callback.onError();
        }

    }
}
