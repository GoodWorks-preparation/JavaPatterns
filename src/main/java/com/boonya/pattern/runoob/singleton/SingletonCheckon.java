package com.boonya.pattern.runoob.singleton;

/**
 * @ClassName: SingletonCheckon
 * @Description: TODO(功能描述:单例模式:登记式/静态内部类)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class SingletonCheckon {

    private static class SingletonHolder {
        private static final SingletonCheckon INSTANCE = new SingletonCheckon();
    }

    private SingletonCheckon (){}

    public static final SingletonCheckon getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
