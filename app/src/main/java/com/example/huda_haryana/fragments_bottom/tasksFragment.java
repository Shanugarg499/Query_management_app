package com.example.huda_haryana.fragments_bottom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.huda_haryana.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class tasksFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tasks, container, false);

        FloatingActionButton addtask = view.findViewById(R.id.add_totasks);

        addtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Will Add Tasks", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}
