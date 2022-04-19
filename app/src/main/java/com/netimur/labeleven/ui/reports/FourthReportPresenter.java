package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.Melting;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

import java.util.ArrayList;

public class FourthReportPresenter extends AbstractPresenter implements ResponseCallback<ArrayList<Melting>>, FourthReportContract.Presenter {
    private final FourthReportContract.View view;

    public FourthReportPresenter(FourthReportContract.View view) {
        this.view = view;
    }


    @Override
    public void onSuccess(ArrayList<Melting> response) {
        view.setData(response);
    }

    @Override
    public void onError() {
        view.onError();
    }


    @Override
    public void getData(String deptId, String month) {
        labApi.getFourthReport(Integer.parseInt(deptId), Integer.parseInt(month), this);
    }
}
