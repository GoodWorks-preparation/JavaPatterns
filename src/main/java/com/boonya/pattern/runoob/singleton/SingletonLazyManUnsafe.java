package com.boonya.pattern.runoob.singleton;

/**
 * @ClassName: SingletonLazyManUnsafe
 * @Description: TODO(功能描述:单例模式:懒汉模式-非线程安全)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class SingletonLazyManUnsafe {

    private static SingletonLazyManUnsafe instance;

    private SingletonLazyManUnsafe (){}

    public static SingletonLazyManUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyManUnsafe();
        }
        return instance;
    }
}
