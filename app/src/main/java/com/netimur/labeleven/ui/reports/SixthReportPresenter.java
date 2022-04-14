package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.SixthReportBody;

import java.util.ArrayList;

public class SixthReportPresenter extends AbstractPresenter implements ResponseCallback, SixthReportContract.Presenter {

    private final SixthReportContract.View view;

    public SixthReportPresenter(SixthReportContract.View view) {
        this.view = view;
    }

    //TODO настроить
    @Override
    public void onSuccess(Object response) {

        view.setData((ArrayList<SixthReportBody>) response);
    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void getData() {
        labApi.getRequest(Constants.SIXTH_REPORT_ENDPOINT, this);
    }
}
