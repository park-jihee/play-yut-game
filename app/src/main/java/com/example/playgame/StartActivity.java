package com.example.playgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class StartActivity extends AppCompatActivity {


    String [] yutname = {"모", "도", "개", "걸", "윷"};
    Random rd = new Random();
    int [] yutImg = {R.drawable.play2, R.drawable.play1};
    ImageView[] imgView = new ImageView[4];


    TextView result;
    Button gameStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        gameStart = (Button) findViewById(R.id.gameStart);
        result = (TextView) findViewById(R.id.result);

        for(int i = 0; i < 4; i++){
            imgView[i] = (ImageView) findViewById(R.id.yut0 + i);
        }

        gameStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.gameStart){
                    setGameStart();
                }
            }
        });
    }

    public void setGameStart() {
        int cnt = 0;

        for (int i = 0; i < 4; i++){
            int n = rd.nextInt(2);
            cnt += n;

            imgView[i].setImageResource(yutImg[n]);
        }

        result.setText(yutname[cnt]);
    }
}
