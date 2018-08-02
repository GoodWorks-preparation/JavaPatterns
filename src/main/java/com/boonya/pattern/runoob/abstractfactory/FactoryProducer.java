package com.boonya.pattern.runoob.abstractfactory;

import com.boonya.pattern.runoob.factory.Shape;

/**
 * @ClassName: FactoryProducer
 * @Description: TODO(功能描述:工厂生产方)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class FactoryProducer{

    /**
     * 获取工厂方法
     * @param choice
     * @return
     */
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
