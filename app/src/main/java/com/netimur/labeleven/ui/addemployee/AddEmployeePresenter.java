package com.netimur.labeleven.ui.addemployee;

import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Employee;

public class AddEmployeePresenter extends AbstractPresenter implements AddEmployeeContract.Presenter, ResponseCallback<Object> {

    private final AddEmployeeContract.View view;

    public AddEmployeePresenter(AddEmployeeContract.View view) {
        this.view = view;
    }

    @Override
    public void onCreateEmployeeButtonClick(String name, String departmentCode) {

        int departmentCodeInt = Integer.parseInt(departmentCode);
        Employee employee = new Employee(0, name, departmentCodeInt);
        labApi.createEmployee(employee, this);

/*
        labApi.postRequest(Constants.STAFF_ENDPOINT, employee, this);
*/


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
