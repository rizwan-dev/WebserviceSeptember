package com.riztech.webserviceseptember.service;

import com.riztech.webserviceseptember.model.BaseResponse;
import com.riztech.webserviceseptember.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiInterface {

    @POST("/myapp/api/employees/single")
    public Call<BaseResponse> addEmployee(@Body Employee employee);

    @GET("/myapp/api/employees")
    public Call<List<Employee>> getAllEmployee();

    @DELETE("/myapp/api/employees/{id}")
    public Call<BaseResponse> deleteEmployee(@Path("id") int id);
}
