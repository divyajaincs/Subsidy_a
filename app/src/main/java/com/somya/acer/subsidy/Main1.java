package com.somya.acer.subsidy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void next2(View view) {
        Intent intent = new Intent(this, subsidy.class);
        startActivity(intent);
    }

    public void next3(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void next4(View view) {
        Toast.makeText(this,"YOUR GAS IS DELIVERED..!!" ,Toast.LENGTH_SHORT).show();
        return;
    }
}