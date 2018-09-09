package com.riztech.webserviceseptember;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.riztech.webserviceseptember.adapter.EmployeeListAdapter;
import com.riztech.webserviceseptember.model.Employee;
import com.riztech.webserviceseptember.service.ApiClient;
import com.riztech.webserviceseptember.service.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetAllEmployeeActivity extends AppCompatActivity {

    RecyclerView rvEmployees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_all_employee);
        rvEmployees = findViewById(R.id.rvEmployees);
        rvEmployees.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Employee>> callEmployee = apiInterface.getAllEmployee();

        callEmployee.enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                List<Employee> employees = response.body();
                EmployeeListAdapter employeeListAdapter = new EmployeeListAdapter(employees);
                rvEmployees.setAdapter(employeeListAdapter);
            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {

            }
        });

    }
}
