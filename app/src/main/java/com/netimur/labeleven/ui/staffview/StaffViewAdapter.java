package com.netimur.labeleven.ui.staffview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.netimur.labeleven.databinding.EmployeeCardBinding;
import com.netimur.labeleven.domain.entity.Employee;

import java.util.ArrayList;

public class StaffViewAdapter extends RecyclerView.Adapter<StaffViewAdapter.EmployeeViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<Employee> employees = new ArrayList<>();

    public StaffViewAdapter(Context context) {
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
        Employee employee = employees.get(position);
        String name = employee.getName();
        String departmentCode = String.valueOf(employee.getDepartmentCode());
        String code = String.valueOf(employee.getCode());
        holder.bind(code, name, departmentCode, view -> {
            StaffViewFragmentDirections.ActionStaffViewFragmentToWorkerViewFragment act =
                StaffViewFragmentDirections.actionStaffViewFragmentToWorkerViewFragment(employee);
            Navigation.findNavController(holder.itemView).navigate(act);
        });
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class EmployeeViewHolder extends RecyclerView.ViewHolder {

        private EmployeeCardBinding binding;


        public EmployeeViewHolder(@NonNull EmployeeCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }


        //TODO доделать
        public void bind(String code, String name, String departmentCode, View.OnClickListener listener) {
            binding.employeeName.setText(name);
            binding.employeeDepartmentCode.setText(departmentCode);
            binding.employeeCard.setOnClickListener(listener);
        }
    }
}
