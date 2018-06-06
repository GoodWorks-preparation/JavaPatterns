package com.boonya.pattern.runoob.prototype;

import java.util.Hashtable;

/**
 * @ClassName: Cache
 * @Description: TODO(功能描述：模拟数据库查询缓存)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class Cache {

    private static Hashtable<String, Prototype> shapeMap= new Hashtable<String, Prototype>();

    public static Prototype getShape(String shapeId) {
        Prototype cachedShape = shapeMap.get(shapeId);
        return (Prototype) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
