package com.riztech.webserviceseptember;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAdd, btnView, btnUpdate, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnView = findViewById(R.id.btnView);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);

    }

    public void addEmployee(View view) {
        Intent intent = new Intent(this, AddEmployeeActivity.class);
        startActivity(intent);
    }

    public void viewEmployee(View view) {
    }

    public void updateEmployee(View view) {
    }

    public void deleteEmployee(View view) {
    }
}
