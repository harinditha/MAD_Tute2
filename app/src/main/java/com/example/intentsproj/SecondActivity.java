package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Get the Intent that started us to find the parameter (extra).
        Intent intent = getIntent();
        int myValue = intent.getIntExtra("Parameter name", 0);
        //display the value to the screen.
        TextView displayNumber = (TextView) findViewById(R.id.textView5);
        displayNumber.setText("" + myValue);
    }
}
