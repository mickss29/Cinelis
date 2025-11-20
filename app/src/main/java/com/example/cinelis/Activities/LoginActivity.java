package com.example.cinelis.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cinelis.R;

public class LoginActivity extends AppCompatActivity {
    private EditText userEdt,passEdt;
    private Button loginbTn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        initView();
    }
     private void initView() {
        userEdt=findViewById(R.id.editTextText);
        passEdt=findViewById(R.id.editTextPassword);
        loginbTn=findViewById(R.id.loginbTn);

        loginbTn.setOnClickListener(v -> {
            if (userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()) {
                Toast.makeText(LoginActivity.this, "Please Fill Your User And Password", Toast.LENGTH_SHORT).show();
            } else if (userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")) {
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            } else {
                Toast.makeText(LoginActivity.this, "Your user and password in not correct", Toast.LENGTH_SHORT).show();
            }
        });
    }
}