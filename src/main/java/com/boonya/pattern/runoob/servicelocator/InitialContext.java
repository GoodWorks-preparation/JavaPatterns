package com.boonya.pattern.runoob.servicelocator;

/**
 * @ClassName: InitialContext
 * @Description: TODO(JNDI 查询创建 InitialContext)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class InitialContext {

    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICEA")){
            System.out.println("Looking up and creating a new ServiceA object");
            return new ServiceA();
        }else if (jndiName.equalsIgnoreCase("SERVICEB")){
            System.out.println("Looking up and creating a new ServiceB object");
            return new ServiceB();
        }
        return null;
    }
}
