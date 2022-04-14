package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;

import java.util.ArrayList;

public class SecondReportFragment extends Fragment implements SecondReportContract.View {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_report, container, false);
    }

    @Override
    public void setData(ArrayList<String> data) {

    }

    @Override
    public void onError() {

    }
}