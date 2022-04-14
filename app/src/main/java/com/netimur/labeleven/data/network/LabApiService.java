package com.netimur.labeleven.data.network;

import android.util.Log;

import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.utils.ResponseHandler;

import retrofit2.Call;

public class LabApiService implements LabApiServiceInterface<Object>{


    private final LabApi labApi;

    public LabApiService(LabApi labApi) {
        this.labApi = labApi;
    }

    @Override
    public void getRequest(String endpoint, ResponseCallback<Object> responseCallback) {
        Log.d("MyTag", "getRequest() invoked");
        Call<Object> call = labApi.getRequest(endpoint);
        ResponseHandler<Object> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void postRequest(String endpoint, Object body, ResponseCallback<Object> responseCallback) {
        Call<Object> call = labApi.postRequest(endpoint, body);
        ResponseHandler<Object> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }

    @Override
    public void patchRequest(String endpoint, Object body, ResponseCallback<Object> responseCallback) {
        Call<Object> call = labApi.patchRequest(endpoint, body);
        ResponseHandler<Object> responseHandler= new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);

    }

    @Override
    public void deleteRequest(String endpoint, ResponseCallback<Object> responseCallback) {
        Call<Object> call = labApi.deleteRequest(endpoint);
        ResponseHandler<Object> responseHandler = new ResponseHandler<>(responseCallback);
        call.enqueue(responseHandler);
    }
}
