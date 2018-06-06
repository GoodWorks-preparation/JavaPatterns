package com.boonya.pattern.runoob.singleton;

/**
 * @ClassName: SingletonDoubleChecked
 * @Description: TODO(功能描述:单例模式:双检锁/双重校验锁（DCL，即 double-checked locking）)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class SingletonDoubleChecked {

    private volatile static SingletonDoubleChecked singleton;

    private SingletonDoubleChecked (){}

    public static SingletonDoubleChecked getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleChecked();
                }
            }
        }
        return singleton;
    }
}
