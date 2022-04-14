package com.netimur.labeleven.ui.departmentsview;

import com.netimur.labeleven.domain.entity.Department;
import com.netimur.labeleven.domain.entity.Element;

import java.util.ArrayList;

public interface DepartmentsViewContract {
    interface View{
        void onSuccess();
        void onError();
        void setData(ArrayList<Department> departments);
    }
    interface Presenter{
        void getData();
    }
}
