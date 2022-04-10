package com.netimur.labeleven.domain.common;

public interface ResponseCallback<T> {
    void onSuccess(T response);
    void onError();
}
