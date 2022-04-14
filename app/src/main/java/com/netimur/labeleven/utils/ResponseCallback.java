package com.netimur.labeleven.utils;

public interface ResponseCallback<T> {
    void onSuccess(T response);
    void onError();
}
