package com.netimur.labeleven.ui.workerview;

import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Employee;

public class WorkerViewPresenter extends AbstractPresenter implements ResponseCallback, WorkerViewContract.Presenter {

    private final WorkerViewContract.View view;
    private Employee currentEmployee;


    public WorkerViewPresenter(WorkerViewContract.View view) {
        this.view = view;
    }

    @Override
    public void onSuccess(Object response) {
        view.onSuccessDelete();

    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void onDeleteButtonClick() {
        int employeeCode = this.currentEmployee.getCode();
        labApi.deleteEmployee(employeeCode, this);

    }

    @Override
    public void setEmployee(Employee employee) {
        this.currentEmployee = employee;
    }
}
