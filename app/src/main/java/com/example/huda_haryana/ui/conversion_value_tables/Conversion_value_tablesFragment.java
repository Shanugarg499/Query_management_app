package com.example.huda_haryana.ui.conversion_value_tables;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huda_haryana.R;

public class Conversion_value_tablesFragment extends Fragment {

    private ConversionValueTablesViewModel mViewModel;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel= ViewModelProviders.of(this).get(ConversionValueTablesViewModel.class);
        return inflater.inflate(R.layout.conversion_value_tables_fragment, container, false);
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = ViewModelProviders.of(this).get(ConversionValueTablesViewModel.class);
//        // TODO: Use the ViewModel
//    }

}
