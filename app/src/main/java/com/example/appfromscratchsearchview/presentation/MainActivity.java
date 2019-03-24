package com.example.appfromscratchsearchview.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;

import com.example.appfromscratchsearchview.R;
import com.example.appfromscratchsearchview.data.model.State;
import com.example.appfromscratchsearchview.data.network.StatesRepositoryImpl;
import com.example.appfromscratchsearchview.data.network.StatesRetrofitSingleton;
import com.example.appfromscratchsearchview.domain.StatesRepository;
import com.example.appfromscratchsearchview.domain.StatesUsecaseImpl;
import com.example.appfromscratchsearchview.presentation.recyclerview.StateAdapter;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private RecyclerView recyclerView;
    private StateAdapter adapter;
    private final List<State> stateList = new ArrayList<>();

    private final CompositeDisposable disposable = new CompositeDisposable();

    private StatesUsecase usecase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SearchView searchView = findViewById(R.id.state_searchview);
        searchView.setOnQueryTextListener(this);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        final Retrofit retrofit = StatesRetrofitSingleton.getInstance();
        final StatesRepository repository = new StatesRepositoryImpl(retrofit);
        usecase = new StatesUsecaseImpl(repository);

        disposable.add(
                usecase.getStateList()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(
                                states -> {
                                    Log.d("Response: ", states.get(0).capital);
                                    stateList.addAll(states);
                                    adapter = new StateAdapter(stateList);
                                    recyclerView.setAdapter(adapter);
                                },
                                error -> {
                                    Log.d("Error getting states", error.getMessage());
                                }
                        )
        );
    }

    @Override
    protected void onStop() {
        disposable.clear();
        super.onStop();
    }

    @Override
    public boolean onQueryTextChange(String s) {
        disposable.add(
                usecase.filterStates(stateList, s)
                        .subscribe(states -> adapter.setData(states))
        );
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }
}
