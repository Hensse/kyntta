package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    EditText item;
    TextView textView_content;
    Button save;
    Button done;
    String s;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        item = findViewById(R.id.item_editText);
        save = findViewById(R.id.id_button_1);
        done = findViewById(R.id.id_button_2);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(item.length()< 3 || item.length()>15){
                    Toast.makeText(MainActivity.this, R.string.WRONG, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, R.string.NICE, Toast.LENGTH_LONG).show();

                }
            }
        });

    done.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            s=item.getText().toString();
            i.putExtra("Item",s);
            startActivity(i);
            finish();
        }
    });




    }
}
