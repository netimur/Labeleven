package com.netimur.labeleven.data.network;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.netimur.labeleven.domain.entity.Element;
import com.netimur.labeleven.utils.Constants;


import java.util.ArrayList;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitInstance {


    private static RetrofitInstance instance;
    private final LabApi labApi;





    private RetrofitInstance() {



      /*  ObjectMapper objectMapper = new ObjectMapper();
        CollectionType collectionType = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, Element.class);
        objectMapper.canDeserialize(collectionType);
        DeserializationConfig config = new DeserializationConfig();
        objectMapper.configure();*/



        labApi = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(UnsafeOkHttpClient.getUnsafeOkHttpClient())
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(LabApi.class);
    }

    public LabApi getLabApi() {
        return this.labApi;
    }


    //TODO Make thread-safe singleton
    public static RetrofitInstance getInstance() {
        if(instance == null) {
            instance = new RetrofitInstance();
        }
        return instance;
    }
}
