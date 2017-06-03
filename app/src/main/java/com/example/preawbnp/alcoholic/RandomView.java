package com.example.preawbnp.alcoholic;

/**
 * Created by preawbnp on 6/3/2017 AD.
 */

public interface RandomView {
    String getOrder();
    int getCalories();
    int getCommonPurse();

    void setOrder(String order);
    void setCalories(int calories);
    void setCommonPurse(int commonPurse);
}
