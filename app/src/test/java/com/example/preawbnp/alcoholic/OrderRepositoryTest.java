package com.example.preawbnp.alcoholic;

import com.example.preawbnp.alcoholic.data.OrderRepository;
import com.example.preawbnp.alcoholic.data.User;
import com.example.preawbnp.alcoholic.random.RandomView;
import com.example.preawbnp.alcoholic.random.RandomPresenter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by preawbnp on 6/4/2017 AD.
 */

public class OrderRepositoryTest {
    OrderRepository orderRepository;
    private int commonPurse = 100;
    private int calories = 50;

    @Before
    public void setUp() throws Exception {
        orderRepository = new OrderRepository();
    }

    @Test
    public void testGetCommonPurse0() {
        int commonPurse0 = orderRepository.getIndex(0).getCommonPurse();
        assertEquals(0, commonPurse0);
    }

    @Test
    public void testGetCalories0() {
        int calories0 = orderRepository.getIndex(0).getCalories();
        assertEquals(120, calories0);
    }

    @Test
    public void testGetOrder0() {
        String order0 = orderRepository.getIndex(0).getOrder();
        assertEquals("ดื่มโค้กครึ่งแก้ว", order0);
    }

    @Test
    public void addCommonPurse() {
        int update = commonPurse + orderRepository.getIndex(0).getCommonPurse();
        assertEquals(100, update);
    }

    @Test
    public void addCalories() {
        int update = calories + orderRepository.getIndex(0).getCalories();
        assertEquals(170, update);
    }

    @Test
    public void getUserOrder0() {
        User user = new User(orderRepository);
        String order = user.getOrderRepository().getIndex(0).getOrder();
        assertEquals("ดื่มโค้กครึ่งแก้ว", order);
    }

}
