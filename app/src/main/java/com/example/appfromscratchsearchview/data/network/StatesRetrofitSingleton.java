package com.example.appfromscratchsearchview.data.network;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class StatesRetrofitSingleton {
    private static final String URL = "https://gist.githubusercontent.com/";
    private static Retrofit instance;

    private StatesRetrofitSingleton() {
    }

    @NonNull
    public static Retrofit getInstance(){
        if(instance == null){
            instance = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return instance;
    }
}
