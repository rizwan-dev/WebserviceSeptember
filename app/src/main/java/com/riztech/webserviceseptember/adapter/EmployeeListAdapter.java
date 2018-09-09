package com.riztech.webserviceseptember.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.riztech.webserviceseptember.R;
import com.riztech.webserviceseptember.model.Employee;

import java.util.List;

public class EmployeeListAdapter extends RecyclerView.Adapter<EmployeeViewHolder>{

    List<Employee> mEmployeeList;

    public EmployeeListAdapter(List<Employee> employees){
        mEmployeeList = employees;
    }
    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_employee_list
                ,parent , false);
        EmployeeViewHolder employeeViewHolder = new EmployeeViewHolder(view);
        return employeeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Employee employee = mEmployeeList.get(position);
        holder.txtName.setText(employee.getName());
        holder.txtAddress.setText(employee.getAddress());
        holder.txtPhone.setText(employee.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return mEmployeeList.size();
    }
}
