package com.kalkulator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText angka_pertama, angka_kedua;
    Button btntambah, btnkurang, btnkali, btnbagi, clear;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka_pertama = findViewById(R.id.angka_pertama);
        angka_kedua = findViewById(R.id.angka_kedua);
        btntambah = findViewById(R.id.tambah);
        btnbagi = findViewById(R.id.bagi);
        btnkurang = findViewById(R.id.kurang);
        btnkali = findViewById(R.id.kali);
        clear = findViewById(R.id.btnClear);
        hasil = findViewById(R.id.answer);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0)&&(angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast= Toast.makeText(MainActivity.this,"Mohon isikan kolom yang tersedia", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0)&&(angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast= Toast.makeText(MainActivity.this,"Mohon isikan kolom yang tersedia", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0)&&(angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast= Toast.makeText(MainActivity.this,"Mohon isikan kolom yang tersedia", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0)&&(angka_kedua.getText().length()>0)){
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }else {
                    Toast toast= Toast.makeText(MainActivity.this,"Mohon isikan kolom yang tersedia", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                hasil.setText("");
                angka_kedua.requestFocus();
            }
        });
    }
    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        builder.setTitle("Exit App...");
        builder.setMessage("Thank you :D");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        final AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}