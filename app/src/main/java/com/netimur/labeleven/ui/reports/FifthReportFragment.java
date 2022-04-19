package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentFifthReportBinding;
import com.netimur.labeleven.domain.entity.FifthReportBody;

import java.util.ArrayList;


public class FifthReportFragment extends Fragment implements FifthReportContract.View {

    private FifthReportContract.Presenter presenter;
    private FragmentFifthReportBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentFifthReportBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        this.presenter = new FifthReportPresenter(this);
        this.binding.getReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = binding.numberEditText.getText().toString();
                presenter.getData(number);
            }
        });

        return view;
    }

    @Override
    public void setData(ArrayList<FifthReportBody> data) {
        this.binding.reportTextView.setText(data.toString());
    }

    @Override
    public void onError() {
        Toast.makeText(requireContext(), "Ошибка", Toast.LENGTH_SHORT).show();
    }
}