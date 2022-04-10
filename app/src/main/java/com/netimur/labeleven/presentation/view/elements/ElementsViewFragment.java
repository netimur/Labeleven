package com.netimur.labeleven.presentation.view.elements;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netimur.labeleven.databinding.FragmentElementsViewBinding;
import com.netimur.labeleven.domain.elementsview.ElementsViewContract;
import com.netimur.labeleven.domain.entity.Element;
import com.netimur.labeleven.presentation.presenter.elements.ElementsPresenter;

import java.util.ArrayList;

public class ElementsViewFragment extends Fragment implements ElementsViewContract.View {


    private FragmentElementsViewBinding binding;
    private ElementsViewAdapter elementsViewAdapter;
    private ElementsViewContract.Presenter presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentElementsViewBinding.inflate(inflater, container, false);
        View view = this.binding.getRoot();
        this.presenter = new ElementsPresenter(this);
        this.elementsViewAdapter = new ElementsViewAdapter(requireContext());
        this.presenter.getData();
        this.binding.recyclerview.setAdapter(this.elementsViewAdapter);


        return view;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void setData(ArrayList<Element> elements) {
        this.elementsViewAdapter.setElements(elements);
        this.binding.recyclerview.setAdapter(this.elementsViewAdapter);
    }
}