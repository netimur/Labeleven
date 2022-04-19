package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentSixthReportBinding;
import com.netimur.labeleven.domain.entity.SixthReportBody;

import java.util.ArrayList;


public class SixthReportFragment extends Fragment implements SixthReportContract.View {

   private SixthReportContract.Presenter presenter;
   private FragmentSixthReportBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentSixthReportBinding.inflate(inflater, container, false);
        this.presenter = new SixthReportPresenter(this);
        this.presenter.getData();
        View view = binding.getRoot();
        return view;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public void setData(ArrayList<SixthReportBody> bodies) {
        this.binding.reportTextView.setText(bodies.toString());
    }

    @Override
    public void onError() {
        ArrayList<SixthReportBody> bodies = new ArrayList<>();
        bodies.add(new SixthReportBody("Zirconium Melting", 3000.0));
        bodies.add(new SixthReportBody("Cuprum Melting", 2000.0));
        bodies.add(new SixthReportBody("Ferrum Melting", 1200.0));
        this.binding.reportTextView.setText(bodies.toString());
    }
}