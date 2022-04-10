package com.netimur.labeleven.data.network;

import com.netimur.labeleven.domain.common.ResponseCallback;

public interface LabApiServiceInterface<T>{

    void getRequest(String endpoint,ResponseCallback<T> responseCallback);
    void postRequest(String endpoint, T body,ResponseCallback<T> responseCallback);
    void patchRequest(String endpoint, T body, ResponseCallback<T> responseCallback);
    void deleteRequest(String endpoint, ResponseCallback<T> responseCallback);


}
