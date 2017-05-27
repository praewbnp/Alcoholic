package com.example.preawbnp.alcoholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        final String[] orderList = {"A","B","C","D","E"};
        final TextView randomText = (TextView) findViewById(R.id.textRandom);

        Button randomBtn = (Button) findViewById(R.id.btnRandom);

        randomBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Random randomNext = new Random();
                int index = randomNext.nextInt(5);

                randomText.setText(orderList[index]);

            }
        });
    }
}
