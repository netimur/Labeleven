package com.netimur.labeleven.ui.addmelting;

import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Melting;

import java.util.Date;

public class AddMeltingPresenter extends AbstractPresenter implements AddMeltingContract.Presenter, ResponseCallback {
    private final AddMeltingContract.View view;

    public AddMeltingPresenter(AddMeltingContract.View view) {
        this.view = view;
    }

    @Override
    public void onAddMeltingButtonClick(int code, int brandCode, int workerCode, int departmentCode, int ovenCode, Date date, String note, float quantity) {

        Melting melting = new Melting(code, brandCode, workerCode, departmentCode, ovenCode, (java.sql.Date) date, note, quantity);
        labApi.postRequest(Constants.MELTINGS_ENDPOINT, melting, this);

    }

    @Override
    public void onSuccess(Object response) {
        view.onSuccess();
    }

    @Override
    public void onError() {
        view.onError();
    }
}
