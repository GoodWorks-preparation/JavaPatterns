package com.boonya.pattern.runoob.abstractfactory;

import com.boonya.pattern.runoob.factory.Shape;

/**
 * @ClassName: AbstractFactory
 * @Description: TODO(功能描述:抽象工厂方法)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
