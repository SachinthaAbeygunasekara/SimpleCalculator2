package com.example.simplecalculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNumber1;
    EditText txtNumber2;
    TextView lblAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtNumber1 = findViewById(R.id.txtNumber);
         txtNumber2 = findViewById(R.id.txtNumber2);
         lblAnswer = findViewById(R.id.lblAnswer);
    }

    double ans = 0;

    public void calculate(View v){

        String value1 = txtNumber1.getText().toString();
        double n1 = Double.parseDouble(value1);

        String value2 = txtNumber2.getText().toString();
        double n2 = Double.parseDouble(value2);

        ans = n1 + n2;

        lblAnswer.setText("Answer is : " + Math.round(ans));
    }

    public void clearCount(View v){
        ans = 0;
        txtNumber1.setText("");
        txtNumber2.setText("");
        lblAnswer.setText("" + Math.round(ans));

    }


}
