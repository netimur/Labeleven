package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentReportsMenuBinding;

public class ReportsMenuFragment extends Fragment {

    private FragmentReportsMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentReportsMenuBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        this.binding.avrgValueOfChemElement.setOnClickListener(view1 -> Navigation.findNavController(view1).navigate(R.id.action_reportsMenuFragment_to_firstReportFragment));

        return view;
    }

}