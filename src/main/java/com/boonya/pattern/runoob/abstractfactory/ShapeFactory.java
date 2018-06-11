package com.boonya.pattern.runoob.abstractfactory;

import com.boonya.pattern.runoob.factory.Circle;
import com.boonya.pattern.runoob.factory.Rectangle;
import com.boonya.pattern.runoob.factory.Shape;
import com.boonya.pattern.runoob.factory.Square;

/**
 * @ClassName: ShapeFactory
 * @Description: TODO(功能描述:形状工厂)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class ShapeFactory extends AbstractFactory{

    @Override
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

    @Override
    public Color getColor(String color) {
        return null;
    }
}
