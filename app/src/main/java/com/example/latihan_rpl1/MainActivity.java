package com.example.latihan_rpl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtusername;
    EditText txtpassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtusername = findViewById(R.id.txtusername);
        txtpassword = findViewById(R.id.txtpassword);
        btnLogin =  findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String username = txtusername.getText().toString();
            String password = txtpassword.getText().toString();

                if (username.equalsIgnoreCase("gutti") && password.equalsIgnoreCase("a")) {
                    Toast.makeText(MainActivity.this, "LOGIN SUKSES", Toast.LENGTH_LONG).show();
                    Intent mIntent = new Intent(getApplicationContext(), Kalkulator.class);
                    startActivity(mIntent);
                }
                else if (username.equals("") || username.trim().isEmpty() || password.equals("") || password.trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "login gagal", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "LOGIN GAGAL", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
