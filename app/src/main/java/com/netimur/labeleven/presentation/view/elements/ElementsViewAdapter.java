package com.netimur.labeleven.presentation.view.elements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.netimur.labeleven.databinding.ElementCardBinding;
import com.netimur.labeleven.domain.entity.Element;

import java.util.ArrayList;

public class ElementsViewAdapter extends RecyclerView.Adapter<ElementsViewAdapter.ElementViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Element> elements = new ArrayList<>();

    public ElementsViewAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    @NonNull
    @Override
    public ElementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ElementViewHolder(ElementCardBinding.inflate(this.inflater, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ElementViewHolder holder, int position) {
        Element element = elements.get(position);
        String name = element.getName();
        int code = element.getCode();
        holder.bind(name, code);
    }

    @Override
    public int getItemCount() {
        return this.elements.size();
    }

    class ElementViewHolder extends RecyclerView.ViewHolder {
        private ElementCardBinding binding;

        public ElementViewHolder(ElementCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(String name, int code) {
            this.binding.elementName.setText(name);
            this.binding.elementCode.setText(code);

        }

    }
}
