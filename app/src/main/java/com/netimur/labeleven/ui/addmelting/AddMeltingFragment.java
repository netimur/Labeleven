package com.netimur.labeleven.ui.addmelting;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.netimur.labeleven.databinding.FragmentAddMeltingBinding;

public class AddMeltingFragment extends Fragment implements AddMeltingContract.View {
    private AddMeltingContract.Presenter presenter;


    private FragmentAddMeltingBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAddMeltingBinding.inflate(inflater, container, false);
        this.presenter = new AddMeltingPresenter(this);


        //TODO implement this
        /*this.binding.continueButton.setOnClickListener(new View.OnClickListener() {
            int code = 0;
            int brandCode = 2;
            int workerCode = 2;
            int departmentCode =2;
            int ovenCode = 2;
            //TODO pass true value of Date
            String note = binding.noteEditText.getText().toString();
            float quantity = 2;

            @Override
            public void onClick(View view) {
                presenter.onAddMeltingButtonClick(code, brandCode, workerCode, departmentCode, ovenCode, date, note, quantity);
            }
        });*/
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public void onSuccess() {
        Toast.makeText(requireContext(), "Successful success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError() {
        Toast.makeText(requireContext(), "Error error", Toast.LENGTH_SHORT).show();
    }
}