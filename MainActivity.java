package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private double num1 = 0;
    private double num2 = 0;
    char ch;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView.setText("");
    }

    public void functionToNumber(View view) {
        Button b =(Button)view;
        String str = b.getText().toString();
        textView.append(str);
    }


    public void functionOp(View view) {
        Button b =(Button)view;
        String str = b.getText().toString();

        ch = str.charAt(0);
        num1 = Integer.parseInt(textView.getText().toString());
        textView.setText("");
    }

    public void functionEqual(View view) {

        num2 = Integer.parseInt(textView.getText().toString());

        switch (ch){
            case '+':
                result = num1+num2;
                textView.setText(result+"");
                break;

            case '-':
                result = num1-num2;
                textView.setText(result+"");
                break;

            case 'X':
                result = num1*num2;
                textView.setText(result+"");
                break;

            case '÷':
                result = num1/num2;
                textView.setText(result+"");
                break;
        }

    }

    public void functionRec(View view) {
        num1=0;
        num2=0;
        textView.clearComposingText();
        textView.setText("");
    }

    public void function_go_to_Scientific_Calculetor(View view) {

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}