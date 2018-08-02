package com.boonya.pattern.runoob.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Broker
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public synchronized void executeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
