package com.netimur.labeleven.ui.departmentsview;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Department;

import java.util.ArrayList;

public class DepartmentsViewPresenter extends AbstractPresenter implements DepartmentsViewContract.Presenter, ResponseCallback<ArrayList<Department>> {
    private final DepartmentsViewContract.View view;

    public DepartmentsViewPresenter(DepartmentsViewContract.View view) {
        this.view = view;
    }


    @Override
    public void onSuccess(ArrayList<Department> response) {
        view.setData(response);
    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void getData() {

        labApi.getDepartments(this);

/*
        labApi.getRequest(Constants.DEPARTMENTS_ENDPOINT, this);
*/
    }
}
