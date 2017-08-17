package com.somya.acer.subsidy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class subsidy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subsidy);
    }
    public void next5(View view)
    {
        Intent intent= new Intent(this,subsidy1.class);
        startActivity(intent);

    }
    }
