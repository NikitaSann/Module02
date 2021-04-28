package com.example.testtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3True extends AppCompatActivity {
    public static int point = 0;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_true);
        textView4 = findViewById(R.id.textView4);
        textView4.setText(String.valueOf(point) + "/2");
    }
}