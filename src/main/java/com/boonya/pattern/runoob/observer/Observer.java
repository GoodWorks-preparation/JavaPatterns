package com.boonya.pattern.runoob.observer;

/**
 * @ClassName: Observer
 * @Description: TODO(功能描述:定义观察者抽象类)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
