package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentThirdReportBinding;
import com.netimur.labeleven.domain.entity.ThirdReportBody;

import java.util.ArrayList;


public class ThirdReportFragment extends Fragment implements ThirdReportContract.View {
    private FragmentThirdReportBinding binding;
    private ThirdReportContract.Presenter presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdReportBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        this.presenter = new ThirdReportPresenter(this);
        this.presenter.getData();
        return view;
    }

    @Override
    public void setData(ArrayList<ThirdReportBody> bodies) {
        this.binding.reportTextView.setText(bodies.toString());
    }

    @Override
    public void onError() {

    }
}