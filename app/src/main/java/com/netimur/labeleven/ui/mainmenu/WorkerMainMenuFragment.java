package com.netimur.labeleven.ui.mainmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentWorkerMainMenuBinding;

public class WorkerMainMenuFragment extends Fragment {

    private FragmentWorkerMainMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentWorkerMainMenuBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_workerMainMenuFragment_to_authorizationFragment);
            }
        });
        binding.registerMeltingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_workerMainMenuFragment_to_addMeltingFragment);
            }
        });

        return view;

    }
}