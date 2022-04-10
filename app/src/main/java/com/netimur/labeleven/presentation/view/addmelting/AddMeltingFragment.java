package com.netimur.labeleven.presentation.view.addmelting;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentAddElementBinding;
import com.netimur.labeleven.databinding.FragmentAddMeltingBinding;

public class AddMeltingFragment extends Fragment {


    private FragmentAddMeltingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddMeltingBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}