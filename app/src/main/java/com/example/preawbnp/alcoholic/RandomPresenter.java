package com.example.preawbnp.alcoholic;

/**
 * Created by preawbnp on 6/3/2017 AD.
 */

class RandomPresenter {
    private OrderRepository repository;
    private RandomView view;

    private int calories = 0;
    private int commonPurse = 0;
    private int orderIndex;

    public RandomPresenter(OrderRepository repository, RandomView view) {
        this.repository = repository;
        this.view = view;
    }
    public void start() {

    }
}
