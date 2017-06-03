package com.example.preawbnp.alcoholic.data;

/**
 * Created by preawbnp on 6/3/2017 AD.
 */

public class Order {
    private int commonPurse;
    private int calories;
    private String order;

    public Order(String order, int commonPurse, int calories) {
        this.order = order;
        this.commonPurse = commonPurse;
        this.calories = calories;
    }

    public int getCommonPurse(){
        return this.commonPurse;
    }

    public int getCalories() {
        return this.calories;
    }

    public String getOrder() {
        return this.order;
    }

}
