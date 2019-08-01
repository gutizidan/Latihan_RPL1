package com.example.latihan_rpl1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {
    Button btnplus;
    Button btnmin;
    Button btnkali;
    Button btnbagi;
    EditText txtangka1;
    EditText txtangka2;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        btnplus = findViewById(R.id.btnplus);
        btnmin = findViewById(R.id.btnmin);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        txtangka1 = findViewById(R.id.txtangka1);
        txtangka2 = findViewById(R.id.txtangka2);
        txthasil = (TextView) findViewById(R.id.texthasil);



            btnplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String angka1 = txtangka1.getText().toString();
                    String angka2 = txtangka2.getText().toString();

                    if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                        Toast.makeText(getApplicationContext(), "gada angka ea bambang", Toast.LENGTH_LONG).show();

                    } else {
                        double angkas1, angkas2, hasill;
                        angkas1 = Double.parseDouble(txtangka1.getText().toString());
                        angkas2 = Double.parseDouble(txtangka2.getText().toString());
                        hasill = angkas1 + angkas2;
                        txthasil.setText("Hasil dari " + angkas1 + " + " + angkas2 + " = " + hasill);

                    }
                }
            });
            btnkali.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String angka1 = txtangka1.getText().toString();
                    String angka2 = txtangka2.getText().toString();

                    if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                        Toast.makeText(getApplicationContext(), "gada angka ea bambang", Toast.LENGTH_LONG).show();

                    } else {
                        double angkas1, angkas2, hasill;
                        angkas1 = Double.parseDouble(txtangka1.getText().toString());
                        angkas2 = Double.parseDouble(txtangka2.getText().toString());
                        hasill = angkas1 * angkas2;
                        txthasil.setText("Hasil dari " + angkas1 + " x " + angkas2 + " = " + hasill);

                    }
                }
            });
            btnmin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String angka1 = txtangka1.getText().toString();
                    String angka2 = txtangka2.getText().toString();

                    if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                        Toast.makeText(getApplicationContext(), "gada angka ea bambang", Toast.LENGTH_LONG).show();

                    } else {
                        double angkas1, angkas2, hasill;
                        angkas1 = Double.parseDouble(txtangka1.getText().toString());
                        angkas2 = Double.parseDouble(txtangka2.getText().toString());
                        hasill = angkas1 - angkas2;
                        txthasil.setText("Hasil dari " + angkas1 + " - " + angkas2 + " = " + hasill);

                    }
                }
            });
            btnbagi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String angka1 = txtangka1.getText().toString();
                    String angka2 = txtangka2.getText().toString();

                    if (angka1.equalsIgnoreCase("") || angka1.trim().isEmpty() || angka2.equalsIgnoreCase("") || angka2.trim().isEmpty()) {
                        Toast.makeText(getApplicationContext(), "gada angka ea bambang", Toast.LENGTH_LONG).show();

                    } else if(angka1.equalsIgnoreCase("0")||angka2.equalsIgnoreCase("0")) {
                        Toast.makeText(getApplicationContext(), "bagi gaboleh 0", Toast.LENGTH_LONG).show();


                    }
                     else{
                        double angkas1, angkas2, hasill;
                        angkas1 = Double.parseDouble(txtangka1.getText().toString());
                        angkas2 = Double.parseDouble(txtangka2.getText().toString());
                        hasill = angkas1 / angkas2;
                        txthasil.setText("Hasil dari " + angkas1 + " % " + angkas2 + " = " + hasill);

                    }
                }
            });


        }
    }
