package com.example.preawbnp.alcoholic.random;

import com.example.preawbnp.alcoholic.data.OrderRepository;

import java.util.Random;

/**
 * Created by preawbnp on 6/3/2017 AD.
 */

public class RandomPresenter {
    private OrderRepository orderRopository;
    private RandomView view;

    private int orderIndex;

    public RandomPresenter(OrderRepository orderRopository, RandomView view) {
        this.orderRopository = orderRopository;
        this.view = view;
    }

    public int randomOrder(){
        Random randomNext = new Random();
        int index = randomNext.nextInt(22);
        orderIndex = index;
        return index;
    }

    public int getValueCommonPurse(){
        return orderRopository.getIndex(orderIndex).getCommonPurse();
    }

    public int getValueCalories(){
        return orderRopository.getIndex(orderIndex).getCalories();
    }

    public int getValueGiveup(){
        return 50;
    }

    public int getRandomIndex(int orderIndex){
        return orderIndex;
    }


}
