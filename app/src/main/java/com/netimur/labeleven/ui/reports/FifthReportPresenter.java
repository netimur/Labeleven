package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.FifthReportBody;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

import java.util.ArrayList;

public class FifthReportPresenter extends AbstractPresenter implements ResponseCallback<ArrayList<FifthReportBody>>, FifthReportContract.Presenter {
    private final FifthReportContract.View view;

    public FifthReportPresenter(FifthReportContract.View view) {
        this.view = view;
    }


    @Override
    public void onSuccess(ArrayList<FifthReportBody> response) {
        view.setData(response);
    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void getData(String month) {

        labApi.getFifthReport(Integer.parseInt(month), this);
    }
}
