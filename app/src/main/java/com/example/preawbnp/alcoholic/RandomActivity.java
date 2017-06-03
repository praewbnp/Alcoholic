package com.example.preawbnp.alcoholic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.preawbnp.alcoholic.data.OrderRepository;

import java.util.Random;

public class RandomActivity extends AppCompatActivity implements RandomView {
    private final String COMMONPURSE_STATE_KEY = "com.example.preawbnp.Alcoholic.COMMONPURSE_STATE_KEY";
    private final String CALORIES_STATE_KEY = "com.example.preawbnp.Alcoholic.CALORIES_STATE_KEY";
    private RandomPresenter presenter;
    private OrderRepository orderRopository;

    private int calories = 0;
    private int commonPurse = 0;
    private int orderIndex;

    TextView commonPurseText, caloriesText, orderText;
    Button randomBtn, doBtn, giveupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        if (savedInstanceState != null){
            commonPurse = savedInstanceState.getInt(COMMONPURSE_STATE_KEY, 0);
            calories = savedInstanceState.getInt(CALORIES_STATE_KEY, 0);
        } else {
            commonPurse = 0;
            calories = 0;
        }

        orderRopository = OrderRepository.getInstance();
        initViewHolders();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(COMMONPURSE_STATE_KEY, commonPurse);
        setCommonPurse(commonPurse);
        savedInstanceState.putInt(CALORIES_STATE_KEY, calories);
        setCalories(calories);

        super.onSaveInstanceState(savedInstanceState);
    }

    private void initViewHolders() {
        createTextView();
        createButton();
    }

    private void createTextView(){
        commonPurseText = (TextView) findViewById(R.id.textBalance);
        setCommonPurse(commonPurse);
        caloriesText = (TextView) findViewById(R.id.textCalories);
        setCalories(calories);
        orderText = (TextView) findViewById(R.id.textRandom);
    }

    public void createButton(){
        randomBtn = (Button) findViewById(R.id.btnRandom);
        doBtn = (Button) findViewById(R.id.btnDo);
        giveupBtn = (Button) findViewById(R.id.btnGiveUp);

        doBtn.setVisibility(View.INVISIBLE);
        giveupBtn.setVisibility(View.INVISIBLE);
    }

    public void setAfterClickAns(){
        orderText.setText("กดเพื่อ Random สิ!");
        randomBtn.setVisibility(View.VISIBLE);
        doBtn.setVisibility(View.INVISIBLE);
        giveupBtn.setVisibility(View.INVISIBLE);
    }

    @Override
    public String getOrder() {
        return orderText.getText().toString();
    }

    @Override
    public int getCalories() {
        return caloriesText.getText().hashCode();
    }

    @Override
    public int getCommonPurse() {
        return commonPurseText.getText().hashCode();
    }

    @Override
    public void setOrder(String order) {
        orderText.setText(order);
    }

    @Override
    public void setCalories(int calories) {
        caloriesText.setText("ALL CALORIES: " + calories);
    }

    @Override
    public void setCommonPurse(int commonPurse) {
        commonPurseText.setText("COMMON FURSE: " + commonPurse);
    }

    public int randomOrder(){
        Random randomNext = new Random();
        int index = randomNext.nextInt(22);
        orderIndex = index;
        return index;
    }

    public void randomClick(View view) {
        int index = randomOrder();

        setOrder(orderRopository.getIndex(index).getOrder());
        randomBtn.setVisibility(View.INVISIBLE);
        doBtn.setVisibility(View.VISIBLE);
        giveupBtn.setVisibility(View.VISIBLE);
    }

    public void doClick(View view) {
        commonPurse += orderRopository.getIndex(orderIndex).getCommonPurse();
        calories += orderRopository.getIndex(orderIndex).getCalories();

        setCommonPurse(commonPurse);
        setCalories(calories);
        setAfterClickAns();
    }

    public void giveupClick(View view) {
        commonPurse += 50;
        setCommonPurse(commonPurse);
        setAfterClickAns();
    }

}
