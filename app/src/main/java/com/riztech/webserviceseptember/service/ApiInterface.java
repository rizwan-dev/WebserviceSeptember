package com.riztech.webserviceseptember.service;

import com.riztech.webserviceseptember.model.BaseResponse;
import com.riztech.webserviceseptember.model.Employee;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("/myapp/api/employees/single")
    public Call<BaseResponse> addEmployee(@Body Employee employee);
}
