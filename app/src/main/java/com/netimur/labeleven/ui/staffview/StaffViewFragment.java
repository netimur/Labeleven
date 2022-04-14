package com.netimur.labeleven.ui.staffview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.databinding.FragmentStaffViewBinding;
import com.netimur.labeleven.domain.entity.Employee;

import java.util.ArrayList;


public class StaffViewFragment  extends Fragment implements StaffViewContract.View {

   private FragmentStaffViewBinding binding;
   private StaffViewContract.Presenter presenter;
   private StaffViewAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentStaffViewBinding.inflate(inflater, container,false);
        View view = binding.getRoot();
        this.adapter = new StaffViewAdapter(requireContext());
        this.presenter = new StaffViewPresenter(this);
        presenter.getData();
        return view;

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void setData(ArrayList<Employee> staff) {
        this.adapter.setEmployees(staff);
        this.binding.recyclerview.setAdapter(adapter);
    }
}