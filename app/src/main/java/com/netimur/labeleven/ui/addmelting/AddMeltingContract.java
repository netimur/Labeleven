package com.netimur.labeleven.ui.addmelting;

import java.util.Date;

public interface AddMeltingContract {

    interface View {
        void onSuccess();
        void onError();
    }
    interface Presenter{
        void onAddMeltingButtonClick(int code, int brandCode, int workerCode, int departmentCode, int ovenCode, Date date, String note, float quantity);
    }
}
