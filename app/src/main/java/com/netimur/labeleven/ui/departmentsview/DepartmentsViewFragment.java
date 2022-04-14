package com.netimur.labeleven.ui.departmentsview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.databinding.FragmentDepartmentsViewBinding;
import com.netimur.labeleven.domain.entity.Department;

import java.util.ArrayList;


public class DepartmentsViewFragment extends Fragment implements DepartmentsViewContract.View {

    private DepartmentsViewContract.Presenter presenter;
    private FragmentDepartmentsViewBinding binding;
    private DepartmentsViewAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentDepartmentsViewBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        this.presenter = new DepartmentsViewPresenter(this);

        this.adapter = new DepartmentsViewAdapter(requireContext());
        this.presenter.getData();
        this.binding.departmentsRecyclerview.setAdapter(this.adapter);
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void setData(ArrayList<Department> departments) {
        this.adapter.setDepartments(departments);
        this.binding.departmentsRecyclerview.setAdapter(this.adapter);
    }



}