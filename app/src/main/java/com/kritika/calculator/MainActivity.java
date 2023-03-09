package com.kritika.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1,b2,b3,b4;
    TextView tv1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= findViewById(R.id.n1);
        et2= findViewById(R.id.n2);
        b1= findViewById(R.id.add);
        b2= findViewById(R.id.sub);
        b3= findViewById(R.id.div);
        b4= findViewById(R.id.mul);
        tv1= findViewById(R.id.tv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,res;
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                res=n1+n2;
                tv1.setText("Result is : "+res);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,res;
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                res=n1-n2;
                tv1.setText("Result is : "+res);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,res;
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                res=n1/n2;
                tv1.setText("Result is : "+res);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,res;
                n1=Integer.parseInt(et1.getText().toString());
                n2=Integer.parseInt(et2.getText().toString());
                res=n1*n2;
                tv1.setText("Result is : "+res);
            }
        });


    }
}