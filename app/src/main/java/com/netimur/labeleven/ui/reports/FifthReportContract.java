package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.FifthReportBody;

import java.util.ArrayList;

public interface FifthReportContract {
    interface View {
        void setData(ArrayList<FifthReportBody> data);
        void onError();
    }

    interface Presenter {
        void getData();
    }

}
