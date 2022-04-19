package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentFourthReportBinding;
import com.netimur.labeleven.domain.entity.Melting;

import java.util.ArrayList;

public class FourthReportFragment extends Fragment implements FourthReportContract.View {

    private FragmentFourthReportBinding binding;
    private FourthReportContract.Presenter presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentFourthReportBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        this.presenter = new FourthReportPresenter(this);
        this.binding.getReportButton.setOnClickListener(view1 -> {
            String deptId = binding.deptEditText.getText().toString();
            String month = binding.monthEditText.getText().toString();
            presenter.getData(deptId, month);
        });
        return view;
    }

    @Override
    public void setData(ArrayList<Melting> data) {
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