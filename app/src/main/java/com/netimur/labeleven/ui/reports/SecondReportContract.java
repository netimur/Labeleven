package com.netimur.labeleven.ui.reports;

import java.util.ArrayList;

public interface SecondReportContract {

    interface View {
        void setData(ArrayList<String> data);
        void onError();
    }

    interface Presenter {
        void getData(String month);
    }

}
