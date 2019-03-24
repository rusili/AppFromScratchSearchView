package com.example.appfromscratchsearchview.domain;

import com.example.appfromscratchsearchview.data.model.StatesWrapper;

import io.reactivex.Single;

public interface StatesRepository {

    Single<StatesWrapper> getStates();
}
