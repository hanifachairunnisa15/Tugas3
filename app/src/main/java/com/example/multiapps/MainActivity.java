package com.example.multiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_view);
    }

    public void clickHospital(View view) {
        //Hospital clicked
        Intent i = new Intent(this,hospital.class);
        startActivity(i);
    }
}