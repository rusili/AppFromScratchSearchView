package com.example.appfromscratchsearchview.presentation.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appfromscratchsearchview.R;
import com.example.appfromscratchsearchview.data.model.State;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateViewHolder> {
    private List<State> states;

    public StateAdapter(@NonNull final List<State> states) {
        this.states = states;
    }

    @NonNull
    @Override
    public StateViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        final View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemview_viewholder, viewGroup, false);
        return new StateViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull StateViewHolder stateViewHolder, int i) {
        stateViewHolder.onBind(states.get(i));
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public void setData(final List<State> newStateList) {
        states = newStateList;
        notifyDataSetChanged();
    }
}
