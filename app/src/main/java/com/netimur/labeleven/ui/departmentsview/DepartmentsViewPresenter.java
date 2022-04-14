package com.netimur.labeleven.ui.departmentsview;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Department;

import java.util.ArrayList;

public class DepartmentsViewPresenter extends AbstractPresenter implements DepartmentsViewContract.Presenter, ResponseCallback {
    private final DepartmentsViewContract.View view;

    public DepartmentsViewPresenter(DepartmentsViewContract.View view) {
        this.view = view;
    }

    @Override
    public void onSuccess(Object response) {

        Log.d("MyTag", "Class of response from api/departments: " + response.getClass());
        ArrayList<Department> departments = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();
        for (Object object: (ArrayList)response
        ) {
            Department department = mapper.convertValue(object, Department.class);
            departments.add(department);
        }

        view.setData(departments);
    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void getData() {
        labApi.getRequest(Constants.DEPARTMENTS_ENDPOINT, this);
    }
}
