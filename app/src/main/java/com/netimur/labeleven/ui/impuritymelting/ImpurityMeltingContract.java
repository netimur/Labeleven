package com.netimur.labeleven.ui.impuritymelting;

public interface ImpurityMeltingContract {

    interface View{
        void onSuccess();
        void onError();
    }
    interface Presenter{
        void OnEditButtonClick(String elementCode);
    }
}
