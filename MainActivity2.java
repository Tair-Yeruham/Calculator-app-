package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    private double num1 = 0;
    private double num2 = 0;
    char ch;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2);
        textView.setText("");

    }

    public void functionNumber(View view) {
        Button b =(Button)view;
        String str = b.getText().toString();
        textView.append(str);
    }

    public void functionREC(View view) {
        num1=0;
        num2=0;
        textView.clearComposingText();
        textView.setText("");
    }

    public void functionEqual(View view) {

        switch (ch){
            case '+':
                num2 = Integer.parseInt(textView.getText().toString());
                result = num1+num2;
                textView.setText(result+"");
                break;

            case '-':
                num2 = Integer.parseInt(textView.getText().toString());
                result = num1-num2;
                textView.setText(result+"");
                break;

            case 'X':
                num2 = Integer.parseInt(textView.getText().toString());
                result = num1*num2;
                textView.setText(result+"");
                break;

            case '÷':
                num2 = Integer.parseInt(textView.getText().toString());
                result = num1/num2;
                textView.setText(result+"");
                break;

            case '^':
                num2 = Integer.parseInt(textView.getText().toString());
                result = Math.pow(num1,num2);
                textView.setText(result+"");
                break;

            case '√':
                result = Math.sqrt(num1);
                textView.setText(result+"");
                break;
        }
    }

    public void functionOp(View view) {
        Button b =(Button)view;
        String str = b.getText().toString();
        ch = str.charAt(0);

        num1 = Integer.parseInt(textView.getText().toString());
        textView.setText("");
    }
}