package com.netimur.labeleven.ui.reports;

import com.netimur.labeleven.domain.entity.SixthReportBody;

import java.util.ArrayList;

public interface SixthReportContract {
    interface View {
        void setData(ArrayList<SixthReportBody> bodies);
        void onError();
    }

    interface Presenter {
        void getData();
    }

}
