package com.boonya.pattern.runoob.servicelocator;

/**
 * @ClassName: ServiceA
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class ServiceB implements Service {

    public void execute(){
        System.out.println("Executing ServiceB");
    }

    @Override
    public String getName() {
        return "ServiceB";
    }
}
