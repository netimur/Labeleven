package com.netimur.labeleven.ui.mainmenu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentDirectorMainMenuBinding;
import com.netimur.labeleven.databinding.FragmentWorkerMainMenuBinding;


public class DirectorMainMenuFragment extends Fragment {

    private FragmentDirectorMainMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentDirectorMainMenuBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        this.binding.departmentsManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_directorMainMenuFragment_to_departmentsViewFragment);
            }
        });

        this.binding.reportsButton.setOnClickListener(view1 -> Navigation.findNavController(view1).navigate(R.id.action_directorMainMenuFragment_to_reportsMenuFragment));
        this.binding.staffManagementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_directorMainMenuFragment_to_staffViewFragment);
            }
        });

        return view;
    }
}