package com.boonya.pattern.runoob.prototype;

/**
 * @ClassName: Rectangle
 * @Description: TODO(功能描述:从原型继承而来的长方形)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class Rectangle extends Prototype {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
