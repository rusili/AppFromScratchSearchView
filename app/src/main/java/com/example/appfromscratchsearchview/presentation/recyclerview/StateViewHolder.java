package com.example.appfromscratchsearchview.presentation.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.appfromscratchsearchview.R;
import com.example.appfromscratchsearchview.data.model.State;

class StateViewHolder extends RecyclerView.ViewHolder {
    private TextView stateName;
    private TextView stateCapital;

    StateViewHolder(@NonNull final View itemView) {
        super(itemView);
        stateName = itemView.findViewById(R.id.stateName_textView);
        stateCapital = itemView.findViewById(R.id.stateCapital_textView);
    }

    void onBind(final State state) {
        stateName.setText(state.name);
        stateCapital.setText(state.capital);
    }
}
