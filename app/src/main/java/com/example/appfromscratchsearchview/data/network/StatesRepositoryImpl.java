package com.example.appfromscratchsearchview.data.network;

import android.support.annotation.NonNull;

import com.example.appfromscratchsearchview.data.model.StatesWrapper;
import com.example.appfromscratchsearchview.domain.StatesRepository;

import io.reactivex.Single;
import retrofit2.Retrofit;

public class StatesRepositoryImpl implements StatesRepository {
    private final Retrofit retrofit;

    public StatesRepositoryImpl(@NonNull final Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    @Override
    public Single<StatesWrapper> getStates() {
        return retrofit.create(StatesApi.class)
                .getStatesEndpoint();
    }
}
