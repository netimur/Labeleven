package com.netimur.labeleven.presentation.presenter.elements;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.netimur.labeleven.common.Constants;
import com.netimur.labeleven.domain.common.AbstractPresenter;
import com.netimur.labeleven.domain.common.ResponseCallback;
import com.netimur.labeleven.domain.elementsview.ElementsViewContract;
import com.netimur.labeleven.domain.entity.Element;

import java.util.ArrayList;

import okhttp3.Response;


public class ElementsPresenter extends AbstractPresenter implements ElementsViewContract.Presenter{

    private final ElementsViewContract.View view;
    public ElementsPresenter(ElementsViewContract.View view) {
        this.view = view;
    }




  /*  @Override
    public void onSuccess(Object response) {
        Log.d("MyTag","Class of response:" + response.getClass());
        ArrayList<Element> elements = new Gson().fromJson(response, ArrayList.class);
        view.setData(elements);
    }*/

    @Override
    public void onSuccess(Response response) {
        Log.d("MyTag","Class of response:" + response.getClass());

        //конвертация
        view.setData(elements);
    }


    @Override
    public void onSuccess(Object response) {

    }

    @Override
    public void onError() {

    }

    @Override
    public void getData() {
        labApi.getRequest(Constants.ELEMENTS_ENDPOINT, this);
    }
}
