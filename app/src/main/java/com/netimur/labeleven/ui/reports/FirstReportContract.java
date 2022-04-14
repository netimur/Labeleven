package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.FirstReportBody;

import java.util.ArrayList;

public interface FirstReportContract {

    interface View {
        void setData(ArrayList<FirstReportBody> data);

        void onError();
    }

    interface Presenter {
        void getData();
    }

}
