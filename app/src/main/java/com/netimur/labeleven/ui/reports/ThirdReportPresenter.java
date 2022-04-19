package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.ThirdReportBody;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;

import java.util.ArrayList;

public class ThirdReportPresenter extends AbstractPresenter implements ThirdReportContract.Presenter, ResponseCallback<ArrayList<ThirdReportBody>> {

    private final ThirdReportContract.View view;

    public ThirdReportPresenter(ThirdReportContract.View view) {
        this.view = view;
    }



    @Override
    public void onSuccess(ArrayList<ThirdReportBody> response) {
        view.setData(response);
    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void getData() {
        labApi.getThirdReport(this);
    }
}
