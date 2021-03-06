package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.databinding.FragmentSecondReportBinding;

import java.util.ArrayList;

public class SecondReportFragment extends Fragment implements SecondReportContract.View {

    private FragmentSecondReportBinding binding;
    private SecondReportContract.Presenter presenter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       this.binding = FragmentSecondReportBinding.inflate(inflater, container, false);
       View view = binding.getRoot();
       this.presenter = new SecondReportPresenter(this);
        this.binding.getReportButton.setOnClickListener(view1 -> {
            String month = binding.numberEditText.getText().toString();
            presenter.getData(month);
        });
       return view;

    }

    @Override
    public void setData(ArrayList<String> data) {
        this.binding.reportTextView.setText(data.toString());
    }

    @Override
    public void onError() {
        Toast.makeText(requireContext(), "Ошибка", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}