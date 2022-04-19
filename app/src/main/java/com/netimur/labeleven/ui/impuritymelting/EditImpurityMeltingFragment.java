package com.netimur.labeleven.ui.impuritymelting;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentEditImpurityMeltingBinding;


public class EditImpurityMeltingFragment extends Fragment implements ImpurityMeltingContract.View {

   FragmentEditImpurityMeltingBinding binding;
   ImpurityMeltingContract.Presenter presenter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentEditImpurityMeltingBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        return view;
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }
}