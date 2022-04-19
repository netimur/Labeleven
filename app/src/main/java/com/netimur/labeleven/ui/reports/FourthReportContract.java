package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.Melting;

import java.util.ArrayList;

public interface FourthReportContract {
    interface View {
        void setData(ArrayList<Melting> data);
        void onError();
    }

    interface Presenter {
        void getData(String deptId, String month);
    }

}
