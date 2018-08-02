package com.boonya.pattern.runoob.servicelocator;

/**
 * @ClassName: ServiceLocator
 * @Description: TODO(服务定位器)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class ServiceLocator {

    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service jndiService = (Service)context.lookup(jndiName);
        cache.addService(jndiService);
        return jndiService;
    }
}
