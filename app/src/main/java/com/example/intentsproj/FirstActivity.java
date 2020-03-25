package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.view.Menu;

public class FirstActivity extends AppCompatActivity {
//    private Button button;
//    String myString = "You just clicked the OK button";
    public static final String EXTRA_NUmber = "com.example.intentsproj.EXTRA_NUMBER";
    public static final String EXTRA_NUmber2 = "com.example.intentsproj.EXTRA_NUMBER2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        openActivity2();

    }

//    public void showtoast() {
//        Toast toast = Toast.makeText(FirstActivity.this, "You just clicked the OK button", Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
//        toast.show();
//    }


        public void openActivity2() {
            Button Btn = (Button) findViewById(R.id.ok);
            Btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_SHORT).show();
//                showtoast();

                    EditText userTextEntry = (EditText) findViewById(R.id.editText3);
//                    String userData = userTextEntry.getText().toString();
//                    int userNumber = Integer.parseInt(userData);
                    int number = Integer.parseInt(userTextEntry.getText().toString());

                    EditText userTextEntry2 = (EditText) findViewById(R.id.editText5);
                    int number2 = Integer.parseInt(userTextEntry2.getText().toString());

                    Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                    intent.putExtra(EXTRA_NUmber, number);
                    intent.putExtra(EXTRA_NUmber2, number2);
                    startActivity(intent);

                    showtoast();

//                openActivity2();
                }
                public void showtoast() {
                    Toast toast = Toast.makeText(FirstActivity.this, "You just clicked the OK button", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
                    toast.show();
                }

            });
        }
    }


//    public void openActivity2() {
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("parameter name", "userNumber");
//        startActivity(intent);
//   }

 //   public void showtoast() {
//        Toast toast = Toast.makeText(this, "You just clicked the OK button", Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
//        toast.show();
//    }
//
//}
