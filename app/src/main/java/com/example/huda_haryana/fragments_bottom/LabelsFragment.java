package com.example.huda_haryana.fragments_bottom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.huda_haryana.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LabelsFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_labels, container, false);

        FloatingActionButton add = view.findViewById(R.id.add_tolabels);
        ImageView search2 = view.findViewById(R.id.search2);

        search2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "For Customers search", Toast.LENGTH_SHORT).show();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "To add labels" , Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


}
