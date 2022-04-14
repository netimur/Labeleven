package com.netimur.labeleven.ui.addemployee;

public interface AddEmployeeContract {
    interface View{
        void onSuccess();
        void onError();
    }
    interface Presenter{
        void onCreateEmployeeButtonClick(String name, String departmentCode);
    }
}
