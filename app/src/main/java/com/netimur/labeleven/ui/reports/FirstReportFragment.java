package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.databinding.FragmentFirstReportBinding;
import com.netimur.labeleven.domain.entity.FirstReportBody;

import java.util.ArrayList;


public class FirstReportFragment extends Fragment implements FirstReportContract.View {

    private FirstReportContract.Presenter presenter;
    private FragmentFirstReportBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       this.binding = FragmentFirstReportBinding.inflate(inflater, container, false);
       View view = binding.getRoot();
       this.presenter = new FirstReportPresenter(this);
       this.presenter.getData();

       return view;
    }


    @Override
    public void setData(ArrayList<FirstReportBody> data) {
        this.binding.textview.setText(data.toString());
    }

    @Override
    public void onError() {

    }
}