package com.example.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5,c6,c7;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = findViewById(R.id.checkBox1);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        c5 = findViewById(R.id.checkBox5);
        c6 = findViewById(R.id.checkBox6);
        c7 = findViewById(R.id.checkBox7);

        b1 = findViewById(R.id.button);

        b1.setOnClickListener(v -> {
            int count=0;
            if(c1.isChecked())
                count++;
            if(c2.isChecked())
                count++;
            if(c3.isChecked())
                count++;
            if(c4.isChecked())
                count++;
            if(c5.isChecked())
                count++;
            if(c6.isChecked())
                count++;
            if(c7.isChecked())
                count++;
            if(count >= 5) {
                Intent i = new Intent(MainActivity.this, MainPage.class);
                startActivity(i);
            }
            else{
                Toast.makeText(MainActivity.this,"Select atleast 5 categories",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}