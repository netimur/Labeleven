package com.netimur.labeleven.ui.authorization;

public interface AuthorizationContract {

    interface View {
        void onSuccessAuth();
        void onError();
    }

    interface Presenter {
        void onAuthButtonClick(String login, String password);
    }
}
