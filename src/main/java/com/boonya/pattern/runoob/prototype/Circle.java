package com.boonya.pattern.runoob.prototype;

/**
 * @ClassName: Circle
 * @Description: TODO(功能描述:从原型继承而来的圆形)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class Circle  extends Prototype {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
