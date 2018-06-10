package com.example.lecon.caculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button buttonAdd;
    private Button buttonSub;
    private Button buttonMul;
    private Button buttonDiv;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        textViewResult = (TextView) findViewById(R.id.textViewResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double edt1 = Double.parseDouble(editText1.getText().toString());
                double edt2 = Double.parseDouble(editText2.getText().toString());

                double edtResult = edt1 + edt2;
                textViewResult.setText(Double.toString(edtResult));
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double edt1 = Double.parseDouble(editText1.getText().toString());
                double edt2 = Double.parseDouble(editText2.getText().toString());

                double edtResult = edt1 - edt2;
                textViewResult.setText(Double.toString(edtResult));
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double edt1 = Double.parseDouble(editText1.getText().toString());
                double edt2 = Double.parseDouble(editText2.getText().toString());

                double edtResult = edt1 * edt2;
                textViewResult.setText(Double.toString(edtResult));
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double edt1 = Double.parseDouble(editText1.getText().toString());
                double edt2 = Double.parseDouble(editText2.getText().toString());

                double edtResult = edt1 / edt2;
                textViewResult.setText(Double.toString(edtResult));
            }
        });

    }
}
