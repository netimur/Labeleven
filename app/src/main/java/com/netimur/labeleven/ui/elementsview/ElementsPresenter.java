package com.netimur.labeleven.ui.elementsview;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Element;

import java.io.IOException;
import java.util.ArrayList;

import okhttp3.Response;


public class ElementsPresenter extends AbstractPresenter implements ElementsViewContract.Presenter, ResponseCallback<Object>{

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
    public void onSuccess(Object response) {
        Log.d("MyTag", "Response to string: " + response.toString());
        Log.d("MyTag", response.getClass().toString());

        ArrayList<Element> elements = new ArrayList<>();


        ObjectMapper objectMapper = new ObjectMapper();
        CollectionType collectionType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Element.class);
        try {
            Log.d("MyTag", "Response parsed by objectMapper + collectionType" + objectMapper.readValue(response.toString(), collectionType));
        } catch (IOException e) {
            Log.d("MyTag", e.toString());

        }


        ObjectMapper mapper = new ObjectMapper();
        for (Object object: (ArrayList)response
             ) {
            Element element = mapper.convertValue(object, Element.class);
            elements.add(element);
        }


        view.setData(elements);
    }

    @Override
    public void onError() {

    }

    @Override
    public void getData() {
        labApi.getRequest(Constants.ELEMENTS_ENDPOINT, this);
    }
}
