package com.somya.acer.subsidy;
import android.widget.Toast;
import android.text.TextUtils;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.lang.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public  class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
            }
    public void next(View view)
    {
        Intent intent= new Intent(this,Main1.class);
        startActivity(intent);
    }
    public void next1(View view)
    {
        Intent intent1= new Intent(this,Main1.class);
        startActivity(intent1);
    }
}
