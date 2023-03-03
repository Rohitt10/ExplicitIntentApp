package com.example.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Receiving data from another activity
        Intent i=getIntent();
        String s=i.getStringExtra("love");
        Toast.makeText(this,"We Passed "+s,Toast.LENGTH_SHORT).show();
    }
}