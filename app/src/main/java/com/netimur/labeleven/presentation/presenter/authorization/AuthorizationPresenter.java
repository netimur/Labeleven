package com.netimur.labeleven.presentation.presenter.authorization;

import com.netimur.labeleven.common.Constants;
import com.netimur.labeleven.domain.authorization.AuthorizationContract;
import com.netimur.labeleven.domain.common.AbstractPresenter;
import com.netimur.labeleven.domain.entity.AuthBody;

public class AuthorizationPresenter extends AbstractPresenter implements AuthorizationContract.Presenter {

    private final AuthorizationContract.View view;

    public AuthorizationPresenter(AuthorizationContract.View view) {
        this.view = view;
    }


    @Override
    public void onSuccess(Object response) {
        view.onSuccessAuth();
    }

    @Override
    public void onError() {
        view.onError();
    }

    @Override
    public void onAuthButtonClick(String login, String password) {
        //TODO check data
        AuthBody authBody = new AuthBody(login, password);
        labApi.postRequest(Constants.AUTH_ENDPOINT, authBody, this);
    }
}
