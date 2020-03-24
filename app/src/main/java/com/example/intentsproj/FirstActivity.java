package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    private Button button;
    String myString = "You just clicked the OK button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button) findViewById(R.id.ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_SHORT).show();
                openActivity2();
            }
        })
        ;
    }


    public void openActivity2() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
   }

}
