package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.SixthReportBody;

import java.util.ArrayList;

public class SixthReportPresenter extends AbstractPresenter implements ResponseCallback<ArrayList<SixthReportBody>>, SixthReportContract.Presenter {

    private final SixthReportContract.View view;

    public SixthReportPresenter(SixthReportContract.View view) {
        this.view = view;
    }


    @Override
    public void onSuccess(ArrayList<SixthReportBody> response) {
        view.setData(response);
    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void getData() {
        labApi.getSixthReport(this);
    }
}
