package com.example.appfromscratchsearchview.data.model;

import androidx.annotation.Nullable;

public final class State {
    public final String name;
    public final String capital;

    public State(@Nullable String name, @Nullable String capital) {
        this.name = name;
        this.capital = capital;
    }
}
