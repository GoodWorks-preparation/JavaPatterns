package com.boonya.pattern.runoob.prototype;

/**
 * @ClassName: MainTest
 * @Description: TODO(功能描述：测试查询原型数据封装)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class MainTest {

    public static void main(String[] args) {
        Cache.loadCache();

        Prototype clonedShape =  Cache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Prototype clonedShape2 = Cache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Prototype clonedShape3 = Cache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
