package com.boonya.pattern.runoob.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Subject
 * @Description: TODO(功能描述:被观察对象)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class Subject {
    /**
     * 定义观察者列表
     */
    private List<Observer> observers= new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
