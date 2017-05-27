package com.example.preawbnp.alcoholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class RandomActivity extends AppCompatActivity {
    private int balance = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        final String[] orderList = {"ซดโค้กครึ่งแก้ว","จ่ายค่าเหล้า 20 บาท","เพียว 1 ฝา","รอดตัวไป","คนข้างขวาโดน 1 ช็อต",
                                    "คนข้างซ้ายโดน 1 ช็อต", "เพียว 5 วินาที", "จ่ายค่าเหล้า 100 บาท", "หมดแก้วทั้งวง", "ได้พัก 2 ตา",
                                    "จูบโต๊ะสองที","ให้คนข้างขวาสั่งอะไรก็ได้","ให้คนข้างซ้ายสั่งอะไรก็ได้","ยกเพียว 10 วินาที","เลือกคนมากินแทน 1 คน",
                                    "BATTLE กับคนตรงข้าม", "ซดน้ำเปล่า 1 แก้ว", "ซดโค้ก 1 แก้ว", "ข้ามคนต่อไปไป", "ย้อนกลับไปทางเดิม"};
        final TextView randomText = (TextView) findViewById(R.id.textRandom);
        Button randomBtn = (Button) findViewById(R.id.btnRandom);

        randomBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Random randomNext = new Random();
                int index = randomNext.nextInt(20);

                randomText.setText(orderList[index] + " : " + index);


            }
        });
    }
}
