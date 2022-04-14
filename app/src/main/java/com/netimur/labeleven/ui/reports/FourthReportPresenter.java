package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

public class FourthReportPresenter extends AbstractPresenter implements ResponseCallback, FourthReportContract.Presenter {
    private final FourthReportContract.View view;

    public FourthReportPresenter(FourthReportContract.View view) {
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
