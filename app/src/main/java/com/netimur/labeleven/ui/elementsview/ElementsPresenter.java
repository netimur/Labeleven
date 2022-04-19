package com.netimur.labeleven.ui.elementsview;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.netimur.labeleven.data.network.RetrofitInstance;
import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Element;
import com.netimur.labeleven.utils.ResponseHandler;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ElementsPresenter extends AbstractPresenter implements ElementsViewContract.Presenter, ResponseCallback<ArrayList<Element>> {

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

   /* @Override
    public void onSuccess(Response response) {
        Log.d("MyTag","Class of response:" + response.getClass());

        //конвертация
        view.setData(elements);
    }*/


    @Override
    public void onSuccess(ArrayList<Element> response) {
        view.setData(response);
    }

    @Override
    public void onError() {

    }

    @Override
    public void getData() {
        Call<ArrayList<Element>> call = RetrofitInstance.getInstance().getLabApi().getElements();
        ResponseHandler<ArrayList<Element>> responseHandler = new ResponseHandler<>(new ResponseCallback<ArrayList<Element>>() {
            @Override
            public void onSuccess(ArrayList<Element> response) {
                view.setData(response);
            }

            @Override
            public void onError() {
                view.onError();
            }
        });
        call.enqueue(responseHandler);
    }
}
