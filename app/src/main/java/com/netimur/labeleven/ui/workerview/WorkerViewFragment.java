package com.netimur.labeleven.ui.workerview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentWorkerViewBinding;
import com.netimur.labeleven.domain.entity.Employee;

public class WorkerViewFragment extends Fragment implements WorkerViewContract.View {

    private WorkerViewContract.Presenter presenter;
    private FragmentWorkerViewBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentWorkerViewBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        this.presenter = new WorkerViewPresenter(this);
        Employee employee = WorkerViewFragmentArgs.fromBundle(getArguments()).getEmployee();
        this.presenter.setEmployee(employee);
        this.binding.name.setText(employee.getName());
        this.binding.code.setText(String.valueOf(employee.getCode()));
        this.binding.departmentCode.setText(String.valueOf(employee.getDepartmentCode()));
        this.binding.dismissButton.setOnClickListener(view1 -> presenter.onDeleteButtonClick());
        return view;
    }

    @Override
    public void onSuccessDelete() {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_workerViewFragment_to_staffViewFragment);
    }

    @Override
    public void onError() {
        Toast.makeText(requireContext(), "Error while dismissing employee", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
