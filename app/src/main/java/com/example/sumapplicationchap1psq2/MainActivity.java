package com.example.sumapplicationchap1psq2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editNumber;
    private EditText editNumber2;
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumber = findViewById(R.id.editNumber);
        editNumber2 = findViewById(R.id.editNumber2);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
    }
    public void calculateSum(View view){
        Toast.makeText(MainActivity.this, "The operation was successful", Toast.LENGTH_SHORT).show();
        String s1 = editNumber.getText().toString();
        String s2 = editNumber2.getText().toString();
        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);
        double sum = num1 + num2;
        textView3.setText("The Sum of above two numbers is " + sum);
    }
}