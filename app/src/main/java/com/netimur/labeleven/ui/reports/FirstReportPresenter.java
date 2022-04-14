package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

public class FirstReportPresenter extends AbstractPresenter implements FirstReportContract.Presenter, ResponseCallback {

    private final FirstReportContract.View view;

    public FirstReportPresenter(FirstReportContract.View view) {
        this.view = view;
    }

    @Override
    public void getData() {
        labApi.getRequest(Constants.FIRST_REPORT_ENDPOINT, this);
    }

    @Override
    public void onSuccess(Object response) {
        /*view.setData(response.toString());*/
    }

    @Override
    public void onError() {

    }
}
