package com.example.testtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
          checkBox1 = findViewById(R.id.checkBox1);
          checkBox2 = findViewById(R.id.checkBox2);
          checkBox3 = findViewById(R.id.checkBox3);
          button2 =  findViewById(R.id.button2);
          button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
        if (checkBox1.isChecked() && checkBox2.isChecked() && !checkBox3.isChecked()){
            MainActivity3True.point += 1;
        }
            Intent intent = new Intent(this, MainActivity3True.class);
            startActivity(intent);}


    }
}




