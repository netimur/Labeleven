package com.netimur.labeleven.ui.departmentsview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.netimur.labeleven.databinding.DepartmentCardBinding;
import com.netimur.labeleven.domain.entity.Department;

import java.util.ArrayList;

public class DepartmentsViewAdapter extends RecyclerView.Adapter<DepartmentsViewAdapter.DepartmentViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<Department> departments = new ArrayList<>();

    public DepartmentsViewAdapter(Context context) {
        Log.d("MyTag", "DepartmentsViewAdapter created");
        this.inflater = LayoutInflater.from(context);
    }

    public void setDepartments(ArrayList<Department> departments) {
        Log.d("MyTag", "departments set");
        this.departments = departments;
    }


    @NonNull
    @Override
    public DepartmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("MyTag", "onCreateViewHolder() invoked");
        return new DepartmentViewHolder(DepartmentCardBinding.inflate(this.inflater));
    }

    @Override
    public void onBindViewHolder(@NonNull DepartmentsViewAdapter.DepartmentViewHolder holder, int position) {
        Log.d("MyTag", "onBindViewHolder() invoked");

        Department department = departments.get(position);
        String name = department.getName();
        String chiefCode = String.valueOf(department.getChiefCode());
        holder.bind(name, chiefCode);
    }

    @Override
    public int getItemCount() {
        return this.departments.size();
    }

    class DepartmentViewHolder extends RecyclerView.ViewHolder {
        private DepartmentCardBinding binding;

        public DepartmentViewHolder(DepartmentCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(String name, String chiefCode) {

            this.binding.departmentName.setText(name);
            this.binding.departmentChiefCode.setText(chiefCode);
            Log.d("MyTag", "name bound: " + name);
            Log.d("MyTag", "chiefCode bound: " + chiefCode);

        }

    }
}
