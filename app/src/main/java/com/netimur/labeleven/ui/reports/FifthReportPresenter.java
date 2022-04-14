package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

public class FifthReportPresenter extends AbstractPresenter implements ResponseCallback, FifthReportContract.Presenter {
    private final FifthReportContract.View view;

    public FifthReportPresenter(FifthReportContract.View view) {
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
