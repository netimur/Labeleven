package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.ThirdReportBody;

import java.util.ArrayList;

public interface ThirdReportContract {
    interface View {
        void setData(ArrayList<ThirdReportBody> bodies);
        void onError();
    }

    interface Presenter {
        void getData();
    }

}
