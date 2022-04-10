package com.netimur.labeleven.domain.common;

import com.netimur.labeleven.data.network.LabApiService;
import com.netimur.labeleven.data.network.RetrofitInstance;

abstract public class AbstractPresenter<T> implements ResponseCallback<T> {

    protected final LabApiService labApi = new LabApiService(RetrofitInstance.getInstance().getLabApi());

}
