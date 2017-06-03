package com.example.preawbnp.alcoholic.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.preawbnp.alcoholic.R;
import com.example.preawbnp.alcoholic.random.RandomActivity;

public class MainActivity extends AppCompatActivity {
    Button startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewHolders();
    }

    private void initViewHolders() {
        startBtn = (Button) findViewById(R.id.btnStart);
    }

    public void goToRandomActivity(View view){
        Intent intent = new Intent(this, RandomActivity.class);
        startActivity(intent);
    }
}
