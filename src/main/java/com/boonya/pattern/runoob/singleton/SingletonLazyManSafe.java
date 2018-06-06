package com.boonya.pattern.runoob.singleton;

/**
 * @ClassName: SingletonLazyManSafe
 * @Description: TODO(功能描述:单例模式:懒汉模式-线程安全)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class SingletonLazyManSafe {

    private static SingletonLazyManSafe instance;

    private SingletonLazyManSafe (){}

    public static synchronized SingletonLazyManSafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyManSafe();
        }
        return instance;
    }
}
