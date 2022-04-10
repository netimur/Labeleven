package com.netimur.labeleven.presentation.view.authorization;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentAuthorizationBinding;
import com.netimur.labeleven.databinding.FragmentRegistrationBinding;
import com.netimur.labeleven.domain.authorization.AuthorizationContract;
import com.netimur.labeleven.presentation.presenter.authorization.AuthorizationPresenter;


public class AuthorizationFragment extends Fragment implements AuthorizationContract.View {

    private FragmentAuthorizationBinding binding;
    private AuthorizationContract.Presenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentAuthorizationBinding.inflate(inflater, container, false);
        View view = this.binding.getRoot();
        this.presenter = new AuthorizationPresenter(this);
        this.binding.continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = binding.loginEditText.getText().toString();
                String password = binding.passwordEditText.getText().toString();
                presenter.onAuthButtonClick(login, password);
            }
        });
        return view;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public void onSuccessAuth() {
        Toast.makeText(requireContext(), "Successful Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(requireContext(), "Error", Toast.LENGTH_SHORT).show();
    }
}