package com.netimur.labeleven.presentation.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentStaffViewBinding;


public class StaffViewFragment extends Fragment {

   private FragmentStaffViewBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentStaffViewBinding.inflate(inflater, container,false);
        View view = binding.getRoot();


        return view;

    }
}