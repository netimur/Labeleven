package com.netimur.labeleven.ui.staffview;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netimur.labeleven.utils.Constants;
import com.netimur.labeleven.utils.AbstractPresenter;
import com.netimur.labeleven.utils.ResponseCallback;
import com.netimur.labeleven.domain.entity.Employee;

import java.util.ArrayList;

public class StaffViewPresenter extends AbstractPresenter implements StaffViewContract.Presenter, ResponseCallback {

    private final StaffViewContract.View view;

    public StaffViewPresenter(StaffViewContract.View view) {
        this.view = view;
    }

    @Override
    public void getData() {
        labApi.getRequest(Constants.STAFF_ENDPOINT, this);
    }

    @Override
    public void onSuccess(Object response) {
        ArrayList<Employee> staff = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        for (Object object: (ArrayList)response
        ) {
            Employee employee = mapper.convertValue(object, Employee.class);
            staff.add(employee);
        }
        view.setData(staff);
    }

    @Override
    public void onError() {
        view.onError();
    }
}
