package com.netimur.labeleven.utils;

import com.netimur.labeleven.data.network.LabApiService;
import com.netimur.labeleven.data.network.RetrofitInstance;

abstract public class AbstractPresenter {

    protected final LabApiService labApi = new LabApiService(RetrofitInstance.getInstance().getLabApi());

}
