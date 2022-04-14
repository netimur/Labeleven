package com.netimur.labeleven.ui.addemployee;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.databinding.FragmentAddEmployeeBinding;


public class AddEmployeeFragment extends Fragment implements AddEmployeeContract.View {

    private FragmentAddEmployeeBinding binding;
    private AddEmployeeContract.Presenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddEmployeeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        this.presenter = new AddEmployeePresenter(this);
        this.binding.continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.nameEditText.getText().toString();
                String departmentCode = binding.departmentCodeEditText.getText().toString();
                presenter.onCreateEmployeeButtonClick(name, departmentCode);
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public void onSuccess() {
        Toast.makeText(requireContext(), "Successful success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onError() {
        Toast.makeText(requireContext(), "Error error", Toast.LENGTH_SHORT).show();

    }
}