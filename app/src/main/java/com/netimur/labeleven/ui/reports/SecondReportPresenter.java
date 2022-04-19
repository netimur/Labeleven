package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.utils.ResponseHandler;

import java.util.ArrayList;

public class SecondReportPresenter extends AbstractPresenter implements SecondReportContract.Presenter, ResponseCallback<ArrayList<String>> {
    private final SecondReportContract.View view;

    public SecondReportPresenter(SecondReportContract.View view) {
        this.view = view;
    }



    @Override
    public void onSuccess(ArrayList<String> response) {
        view.setData(response);
    }

    @Override
    public void onError() {

    }

    @Override
    public void getData(String month) {
        labApi.getSecondReport(Integer.parseInt(month),this);

    }
}
