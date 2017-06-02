package com.example.preawbnp.alcoholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class RandomActivity extends AppCompatActivity {
    private int giveup = 0;
    private int calories = 0;
    private int commonPurse = 0;
    private int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        final String[] orderList = {"ดื่มโค้กครึ่งแก้ว","จ่ายค่าเหล้า 20 บาท","เพียว 1 ฝา","รอดตัวไป","คนข้างขวาโดน 1 ช็อต",
                                    "คนข้างซ้ายโดน 1 ช็อต", "เพียว 5 วินาที", "จ่ายค่าเหล้า 100 บาท", "หมดแก้วทั้งวง", "ได้พัก 2 ตา",
                                    "จูบโต๊ะสองที","ให้คนข้างขวาสั่งอะไรก็ได้","ให้คนข้างซ้ายสั่งอะไรก็ได้","ยกเพียว 10 วินาที","เลือกคนมากินเพียว 5 วิแทน 1 คน",
                                    "BATTLE กับคนตรงข้าม", "ซดน้ำเปล่า 1 แก้ว", "ซดโค้ก 1 แก้ว", "ข้ามคนต่อไปไป", "ย้อนกลับไปทางเดิม"};
        final TextView balanceText = (TextView) findViewById(R.id.textBalance);
        final TextView caloriesText = (TextView) findViewById(R.id.textCalories);
        final TextView randomText = (TextView) findViewById(R.id.textRandom);

        Button randomBtn = (Button) findViewById(R.id.btnRandom);
        Button doBtn = (Button) findViewById(R.id.btnDo);
        Button giveupBtn = (Button) findViewById(R.id.btnGiveUp);
//        Button startBtn = (Button) findViewById(R.id.btnStart);

        randomBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Random randomNext = new Random();
                int index = randomNext.nextInt(20);
                x = index;

                randomText.setText(orderList[index] + "_" + index);
            }
        });

        doBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (x) {
                    case 0:
                        calories += 120;
                        break;
                    case 1:
                        commonPurse += 20;
                        break;
                    case 2: case 4: case 5: case 6: case 14:
                        calories += 90;
                        break;
                    case 7:
                        commonPurse += 100;
                        break;
                    case 8:
                        calories += (90+120);
                        break;
                    case 13:
                        calories += 180;
                        break;
                    case 15:
                        calories -= 50;
                        break;
                    case 16:
                        calories += 0;
                        break;
                    case 17:
                        calories += 240;
                        break;
                    case 3: case 9: case 10: case 11: case 12: case 18: case 19:
                        break;
                    default:
                        break;
                }
            }
        });

        giveupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giveup++;
                commonPurse += 50;
                balanceText.setText("COMMON FURSE: " + commonPurse);
            }
        });
    }
}
