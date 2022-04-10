package com.netimur.labeleven.presentation.view.registration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.netimur.labeleven.databinding.EmployeeCardBinding;
import com.netimur.labeleven.domain.entity.Employee;

import java.util.ArrayList;

public class StaffRecyclerViewAdapter extends RecyclerView.Adapter<StaffRecyclerViewAdapter.EmployeeViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<Employee> employees = new ArrayList<>();


    public StaffRecyclerViewAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EmployeeViewHolder(EmployeeCardBinding.inflate(this.inflater, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Employee employee = this.employees.get(position);
        String name = employee.getName();
        int departmentCode = employee.getDepartmentCode();
        holder.bind(name, departmentCode, null);
    }

    @Override
    public int getItemCount() {
        return this.employees.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        private EmployeeCardBinding binding;


        public EmployeeViewHolder(EmployeeCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        void bind(String name, int departmentCode, View.OnClickListener onClickListener) {
            binding.employeeName.setText(name);
            binding.employeeDepartmentCode.setText(departmentCode);
            binding.employeeCard.setOnClickListener(onClickListener);
        }

    }
}
