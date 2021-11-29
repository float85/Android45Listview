package com.android45.listviewdemoandroid45;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AddContactActivity extends AppCompatActivity {
    TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        tvName=findViewById(R.id.tvNameAdd);

        Intent intent=getIntent();

        String name =intent.getStringExtra("KeyName");

        tvName.setText(name);
    }
}