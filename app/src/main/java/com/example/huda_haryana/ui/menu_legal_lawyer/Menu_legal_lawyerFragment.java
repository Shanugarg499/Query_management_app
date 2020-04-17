package com.example.huda_haryana.ui.menu_legal_lawyer;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.huda_haryana.R;

public class Menu_legal_lawyerFragment extends Fragment {

    private MenuLegalLawyerViewModel mViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = ViewModelProviders.of(this).get(MenuLegalLawyerViewModel.class);
        return inflater.inflate(R.layout.menu_legal_lawyer_fragment, container, false);
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = ViewModelProviders.of(this).get(MenuLegalLawyerViewModel.class);
//        // TODO: Use the ViewModel
//    }

}
