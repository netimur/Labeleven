package com.netimur.labeleven.data.network;


import com.netimur.labeleven.utils.Constants;



import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitInstance {


    private static RetrofitInstance instance;
    private final LabApi labApi;





    private RetrofitInstance() {




        labApi = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(UnsafeOkHttpClient.getUnsafeOkHttpClient())
                .addConverterFactory(new NullOnEmptyConverterFactory())
                .addConverterFactory(JacksonConverterFactory.create())
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
