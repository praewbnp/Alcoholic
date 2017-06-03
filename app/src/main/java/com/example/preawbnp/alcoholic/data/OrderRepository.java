package com.example.preawbnp.alcoholic.data;

import java.util.ArrayList;

/**
 * Created by preawbnp on 6/3/2017 AD.
 */

public class OrderRepository {
    private static ArrayList<Order> orders;

    static OrderRepository singleInstance = null;

    static public OrderRepository getInstance() {
        if(singleInstance == null) {
            singleInstance = new OrderRepository();
        }
        return singleInstance;
    }

    public OrderRepository() {
        orders = new ArrayList<Order>();
        orders.add(new Order("ดื่มโค้กครึ่งแก้ว",0,120));
        orders.add(new Order("จ่ายค่าเหล้า 20 บาท",20,0));
        orders.add(new Order("เพียว 1 ฝา",0,90));
        orders.add(new Order("รอดตัวไป",0,0));
        orders.add(new Order("คนข้างขวาโดน 1 ช็อต",0,90));

        orders.add(new Order("คนข้างซ้ายโดน 1 ช็อต",0,90));
        orders.add(new Order("เพียว 5 วิ",0,90));
        orders.add(new Order("จ่ายค่าเหล้า 100 บาท",100,0));
        orders.add(new Order("หมดแก้วรอบวง",0,90+120));
        orders.add(new Order("ได้พัก 2 ตา",0,0));

        orders.add(new Order("จูบโต๊ะสองที",0,0));
        orders.add(new Order("ให้คนข้างขวาสั่งอะไรก็ได้",0,0));
        orders.add(new Order("ให้คนข้างซ้ายสั่งอะไรก็ได้",0,0));
        orders.add(new Order("ยกเพียว 10 วินาที",0,180));
        orders.add(new Order("เลือกคนมากินเพียว 5 วิแทน 1 คน",0,90));

        orders.add(new Order("BATTLE กับคนตรงข้าม",0,-50));
        orders.add(new Order("ซดน้ำเปล่า 2 แก้ว",0,0));
        orders.add(new Order("ซดโค้ก 1 แก้ว",0,240));
        orders.add(new Order("ข้ามคนต่อไปไป",0,0));
        orders.add(new Order("ย้อนกลับไปทางเดิม",0,0));

        orders.add(new Order("เล่าเรื่องที่ขายหน้าสุดในชีวิต",0,0));
        orders.add(new Order("บอกความลับมา 1 เรื่อง",0,0));
    }

    public Order getIndex(int index){
        return orders.get(index);
    }
}
