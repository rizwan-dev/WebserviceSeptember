package com.riztech.webserviceseptember.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.riztech.webserviceseptember.R;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {
    TextView txtName, txtAddress, txtPhone;
    Button btnDelete;
    EmployeeClickListener mListener;

    public EmployeeViewHolder(View itemView, EmployeeClickListener listener) {
        super(itemView);
        mListener = listener;
        txtName = itemView.findViewById(R.id.txtName);
        txtAddress = itemView.findViewById(R.id.txtAddress);
        txtPhone = itemView.findViewById(R.id.txtPhone);
        btnDelete = itemView.findViewById(R.id.btnDelete);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                mListener.onDeleteClick(position);
            }
        });
    }
}
