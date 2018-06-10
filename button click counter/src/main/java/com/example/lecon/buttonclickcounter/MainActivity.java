package com.example.lecon.buttonclickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button ourButton;
    private TextView ourMessage;
    private int numTimeClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ourButton = (Button) findViewById(R.id.button);
        ourMessage = (TextView) findViewById(R.id.textView);

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            public void onClick(View v) {
                numTimeClicked = numTimeClicked + 1;
                if(numTimeClicked == 1) {
                    ourMessage.setText("The button got clicked " + numTimeClicked + " time");
                }else{
                    ourMessage.setText("The button got clicked " + numTimeClicked + " times");
                }
            }
        };

        ourButton.setOnClickListener(ourOnClickListener);
    }
}
