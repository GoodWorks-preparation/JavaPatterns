package com.boonya.pattern.runoob.abstractfactory;

/**
 * @ClassName: Red
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
