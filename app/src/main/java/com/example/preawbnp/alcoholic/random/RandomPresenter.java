package com.example.preawbnp.alcoholic.random;

import com.example.preawbnp.alcoholic.data.OrderRepository;

import java.util.Random;

/**
 * Created by preawbnp on 6/3/2017 AD.
 */

class RandomPresenter {
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

    public int updateCommonPurse(){
        return orderRopository.getIndex(orderIndex).getCommonPurse();
    }

    public int updateCalories(){
        return orderRopository.getIndex(orderIndex).getCalories();
    }

    public int updateGiveup(){
        return 50;
    }

}
