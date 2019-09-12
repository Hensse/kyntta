package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;


public class SecondActivity extends AppCompatActivity {

    TextView tv;
    String st;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv=findViewById(R.id.textView);

        st=getIntent().getExtras().getString("Item");

        tv.setText(st);
    }
}
