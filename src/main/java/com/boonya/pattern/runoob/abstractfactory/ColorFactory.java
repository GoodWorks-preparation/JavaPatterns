package com.boonya.pattern.runoob.abstractfactory;

import com.boonya.pattern.runoob.factory.Shape;

/**
 * @ClassName: ColorFactory
 * @Description: TODO(功能描述:颜色工厂)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class  ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
   public  Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}