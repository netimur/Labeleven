package com.netimur.labeleven.ui.addelement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentAddElementBinding;


public class AddElementFragment extends Fragment {

    private FragmentAddElementBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddElementBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        return view;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}