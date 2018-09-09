package com.riztech.webserviceseptember.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.riztech.webserviceseptember.R;

public class EmployeeViewHolder extends RecyclerView.ViewHolder{
    TextView txtName, txtAddress, txtPhone;

    public EmployeeViewHolder(View itemView) {
        super(itemView);
        txtName = itemView.findViewById(R.id.txtName);
        txtAddress = itemView.findViewById(R.id.txtAddress);
        txtPhone = itemView.findViewById(R.id.txtPhone);
    }
}
