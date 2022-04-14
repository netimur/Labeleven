package com.netimur.labeleven.ui.reports;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.R;
import com.netimur.labeleven.domain.entity.ThirdReportBody;

import java.util.ArrayList;


public class ThirdReportFragment extends Fragment implements ThirdReportContract.View {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_report, container, false);
    }

    @Override
    public void setData(ArrayList<ThirdReportBody> bodies) {

    }

    @Override
    public void onError() {

    }
}