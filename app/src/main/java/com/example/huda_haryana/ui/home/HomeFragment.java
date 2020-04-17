package com.example.huda_haryana.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.huda_haryana.R;
import com.example.huda_haryana.fragments_bottom.LabelsFragment;
import com.example.huda_haryana.fragments_bottom.LeadsFragment;
import com.example.huda_haryana.fragments_bottom.mybusinessFragment;
import com.example.huda_haryana.fragments_bottom.tasksFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);

        getChildFragmentManager().beginTransaction().replace(R.id.fragment_container, new LeadsFragment()).commit();

        View view = inflater.inflate(R.layout.fragment_home, container, false);



        BottomNavigationView bottomNavigationView = view.findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        return view;
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_leads:
                            selectedFragment = new LeadsFragment();
                            Toast.makeText(getActivity(), "You clicked leads", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.nav_labels:selectedFragment = new LabelsFragment();
                            Toast.makeText(getActivity(), "You clicked labels", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.nav_tasks:selectedFragment = new tasksFragment();
                            Toast.makeText(getActivity(), "You clicked tasks", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.nav_business:selectedFragment = new mybusinessFragment();
                            Toast.makeText(getActivity(), "You clicked business", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    getChildFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return true;
                }
            };
}
