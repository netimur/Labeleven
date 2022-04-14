package com.netimur.labeleven.ui.elementsview;

import com.netimur.labeleven.domain.entity.Element;

import java.util.ArrayList;

public interface ElementsViewContract {
    interface View{
        void onSuccess();
        void onError();
        void setData(ArrayList<Element> elements);
    }
    interface Presenter{
        void getData();
    }
}
