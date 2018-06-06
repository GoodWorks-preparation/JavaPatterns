package com.boonya.pattern.runoob.singleton;

/**
 * @ClassName: SingletonHangryMan
 * @Description: TODO(功能描述:单例模式:饿汉式-推荐使用方式)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class SingletonHangryMan {

    private static SingletonHangryMan instance = new SingletonHangryMan();

    private SingletonHangryMan(){}

    public static SingletonHangryMan getInstance() {
        return instance;
    }
}
