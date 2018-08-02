package com.boonya.pattern.runoob.servicelocator;

/**
 * @ClassName: MainTest
 * @Description: TODO(服务定位器测试)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class MainTest {

    /**
     *程序入口
     * @param args
     */
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("ServiceA");
        service.execute();
        service = ServiceLocator.getService("ServiceB");
        service.execute();
        service = ServiceLocator.getService("ServiceA");
        service.execute();
        service = ServiceLocator.getService("ServiceB");
        service.execute();
    }
}
