package com.example.appfromscratchsearchview.presentation;

import com.example.appfromscratchsearchview.data.model.State;

import java.util.List;

import io.reactivex.Single;

public interface StatesUsecase {

    Single<List<State>> getStateList();

    Single<List<State>> filterStates(final List<State> stateList,
                                     final String filter);
}
