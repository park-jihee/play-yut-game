package com.example.playgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{

    LinearLayout start, explanation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (LinearLayout) findViewById(R.id.start);
        explanation = (LinearLayout) findViewById(R.id.explanation);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_intent = new Intent(MainActivity.this, StartActivity.class);
                startActivity(start_intent);
            }
        });

        explanation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explanation_intent = new Intent(MainActivity.this, ExplanationActivity.class);
                startActivity(explanation_intent);
            }
        });
    }
}
