package com.netimur.labeleven.ui.staffview;

import com.netimur.labeleven.domain.entity.Employee;

import java.util.ArrayList;

public interface StaffViewContract {
    interface View{
        void onSuccess();
        void onError();
        void setData(ArrayList<Employee> staff);
    }
    interface Presenter{
        void getData();
    }
}
