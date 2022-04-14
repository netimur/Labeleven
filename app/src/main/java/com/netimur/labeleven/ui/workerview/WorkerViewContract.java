package com.netimur.labeleven.ui.workerview;

import com.netimur.labeleven.domain.entity.Employee;

public interface WorkerViewContract {

    interface View {
        void onSuccessDelete();
        void onError();

    }

    interface Presenter {
        void onDeleteButtonClick();
        void setEmployee(Employee employee);
    }
}
