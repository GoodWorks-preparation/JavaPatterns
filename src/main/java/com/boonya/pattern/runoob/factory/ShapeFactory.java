package com.boonya.pattern.runoob.factory;

/**
 * @ClassName: ShapeFactory
 * @Description: TODO(功能描述：工厂模式)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

}
