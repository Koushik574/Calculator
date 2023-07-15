package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    float f1, f2, f;
    boolean sum, diff, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating objects for buttons
        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button bsum = findViewById(R.id.bsum);
        Button bdiff = findViewById(R.id.bdiff);
        Button bmul = findViewById(R.id.bmul);
        Button bdiv = findViewById(R.id.bdiv);
        Button bdot = findViewById(R.id.bdot);
        Button bopen = findViewById(R.id.bopen);
        Button bclose = findViewById(R.id.bclose);
        Button bequals = findViewById(R.id.bequals);
        Button bc = findViewById(R.id.bc);
        Button bac = findViewById(R.id.bac);


        //Create object for edit text

        EditText et = findViewById(R.id.et);

        //Onclick for all buttons
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(et.getText() + "9");
            }
        });

        bc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText("");
            }
        });

        bac.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText("");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                et.setText(".");
            }
        });

        bsum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                f1 = Float.parseFloat(et.getText().toString());
                et.setText("");
                sum = true;
            }
        });

        bsum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                f1 = Float.parseFloat(et.getText().toString());
                et.setText("");
                sum = true;
            }
        });

        bdiff.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                f1 = Float.parseFloat(et.getText().toString());
                et.setText("");
                diff = true;
            }
        });

        bmul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                f1 = Float.parseFloat(et.getText().toString());
                et.setText("");
                mul = true;
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                f1 = Float.parseFloat(et.getText().toString());
                et.setText("");
                div = true;
            }
        });


        //logic for computation

        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sum == true){

                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 + f2;
                    et.setText(String.valueOf(f));
                    sum = false;
                }
                else if(diff == true){

                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 - f2;
                    et.setText(String.valueOf(f));
                    diff = false;

                }
                else if(mul == true){

                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 * f2;
                    et.setText(String.valueOf(f));
                    mul = false;

                }
                else if(div == true){

                    f2 = Float.parseFloat(et.getText().toString());
                    f = f1 / f2;
                    et.setText(String.valueOf(f));
                    div = false;

                }
            }
        });

    }
}