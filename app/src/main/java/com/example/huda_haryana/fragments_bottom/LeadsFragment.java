package com.example.huda_haryana.fragments_bottom;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.huda_haryana.R;
import com.example.huda_haryana.ask_details;
import com.example.huda_haryana.ui.analysis.AnalysisViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LeadsFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leads, container, false);
        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ask_details.class);
                startActivity(intent);
            }
        });
        return view;
    }


}
