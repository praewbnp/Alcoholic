package com.example.preawbnp.alcoholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bull = (Button) findViewById(R.id.bull);
        bull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, RandomActivity.class);
                startActivity(intent1);
            }
        });
    }

    public void goToRandomActivity(View view){
        Intent intent = new Intent(this, RandomActivity.class);
        startActivity(intent);
    }
}
