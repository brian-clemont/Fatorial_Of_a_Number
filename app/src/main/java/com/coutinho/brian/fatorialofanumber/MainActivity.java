package com.coutinho.brian.fatorialofanumber;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button result;
    EditText input;
    TextView view_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (Button)findViewById(R.id.Result_Button);
        view_result= (TextView)findViewById(R.id.result);
        input =(EditText)findViewById(R.id.input_number);

        result.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {

        int number = Integer.parseInt(input.getText().toString());
        int fact= 1;
        for (int i=1;i<=number;i++)
            fact = fact *i;
        
        view_result.setText("Factorial is "+fact);

        }

    }
