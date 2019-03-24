package com.example.appfromscratchsearchview.domain;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.appfromscratchsearchview.data.model.State;
import com.example.appfromscratchsearchview.data.network.StatesRepositoryImpl;
import com.example.appfromscratchsearchview.presentation.StatesUsecase;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public class StatesUsecaseImpl implements StatesUsecase {
    private final StatesRepository repository;

    public StatesUsecaseImpl(@NonNull final StatesRepository repository) {
        this.repository = repository;
    }

    @NonNull
    public Single<List<State>> getStateList() {
        return repository.getStates()
                .map(wrapper -> wrapper.getAllStates());
    }

    @NonNull
    public Single<List<State>> filterStates(@Nullable final List<State> stateList,
                                            @Nullable final String filter) {
        return Observable.fromArray(stateList)
                .flatMapIterable(list -> list)
                .filter(state -> state.name.toLowerCase().startsWith(filter.toLowerCase()))
                .toList();
    }
}
