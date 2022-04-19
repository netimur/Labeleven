package com.netimur.labeleven.ui.staffview;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Employee;

import java.util.ArrayList;

public class StaffViewPresenter extends AbstractPresenter implements StaffViewContract.Presenter, ResponseCallback<ArrayList<Employee>> {

    private final StaffViewContract.View view;

    public StaffViewPresenter(StaffViewContract.View view) {
        this.view = view;
    }

    @Override
    public void getData() {

        labApi.getStaff(this);


    }


    @Override
    public void onSuccess(ArrayList<Employee> response) {
        view.setData(response);
    }

    @Override
    public void onError() {
        view.onError();
    }
}
