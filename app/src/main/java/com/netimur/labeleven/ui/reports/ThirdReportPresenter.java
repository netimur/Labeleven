package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

public class ThirdReportPresenter extends AbstractPresenter implements ThirdReportContract.Presenter, ResponseCallback {

    private final ThirdReportContract.View view;

    public ThirdReportPresenter(ThirdReportContract.View view) {
        this.view = view;
    }

    @Override
    public void onSuccess(Object response) {

    }

    @Override
    public void onError() {

    }

    @Override
    public void getData() {

    }
}
