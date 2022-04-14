package com.netimur.labeleven.ui.authorization;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.R;
import com.netimur.labeleven.databinding.FragmentAuthorizationBinding;


public class AuthorizationFragment extends Fragment implements AuthorizationContract.View {

    private FragmentAuthorizationBinding binding;
    private AuthorizationContract.Presenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentAuthorizationBinding.inflate(inflater, container, false);
        View view = this.binding.getRoot();
        this.presenter = new AuthorizationPresenter(this);
        this.binding.continueButton.setOnClickListener(view1 -> {
            String login = binding.loginEditText.getText().toString();
            String password = binding.passwordEditText.getText().toString();
            presenter.onAuthButtonClick(login, password);
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
        Navigation.findNavController(this.binding.getRoot()).navigate(R.id.action_authorizationFragment_to_directorMainMenuFragment);
    }

    @Override
    public void onError() {
        Toast.makeText(requireContext(), "Error", Toast.LENGTH_SHORT).show();
    }
}