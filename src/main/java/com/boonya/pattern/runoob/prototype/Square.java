package com.boonya.pattern.runoob.prototype;

/**
 * @ClassName: Square
 * @Description: TODO(功能描述:从原型继承而来的正方形)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class Square extends Prototype {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
