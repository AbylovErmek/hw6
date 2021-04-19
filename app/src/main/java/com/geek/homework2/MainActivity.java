package com.geek.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.et_email);
        password = findViewById(R.id.et_password);
        btnOk = findViewById(R.id.btn_signIn);

        btnOk.setOnClickListener(v->{
           if (email.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
               Toast.makeText(this,"Заполните поля", Toast.LENGTH_SHORT).show();
           }else {
               Toast.makeText(this,"Добро пожаловать!", Toast.LENGTH_SHORT).show();
               btnOk.setBackground(getDrawable(R.color.orange));

           }


        });
    }
}