package com.example.siddh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int i=0;
    private String tex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = findViewById(R.id.myButton);
        myButton.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        i++;
                        tex= Integer.toString(i);
                        TextView textse = findViewById(R.id.dronemiststext);
                        textse.setText(tex);

                    }
                }
        );


    }
}
