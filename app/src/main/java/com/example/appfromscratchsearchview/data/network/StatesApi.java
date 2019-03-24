package com.example.appfromscratchsearchview.data.network;

import com.example.appfromscratchsearchview.data.model.StatesWrapper;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface StatesApi {
    String PATH = "jpriebe/d62a45e29f24e843c974/raw/b1d3066d245e742018bce56e41788ac7afa60e29/us_state_capitals.json";

    @GET(PATH)
    Single<StatesWrapper> getStatesEndpoint();
}
