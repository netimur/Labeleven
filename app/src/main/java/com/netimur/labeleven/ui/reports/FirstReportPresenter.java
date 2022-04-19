package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.FirstReportBody;
import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

import java.util.ArrayList;

public class FirstReportPresenter extends AbstractPresenter implements FirstReportContract.Presenter, ResponseCallback<ArrayList<FirstReportBody>> {

    private final FirstReportContract.View view;

    public FirstReportPresenter(FirstReportContract.View view) {
        this.view = view;
    }

    @Override
    public void getData() {
        labApi.getFirstReport(this);
    }


    @Override
    public void onSuccess(ArrayList<FirstReportBody> response) {
        view.setData(response);
    }

    @Override
    public void onError() {
        view.onError();
    }
}
