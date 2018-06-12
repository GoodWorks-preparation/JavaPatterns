package com.boonya.pattern.runoob.interceptingfilter;

/**
 * @ClassName: Target
 * @Description: TODO(功能描述:业务目标)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class ServiceTarget {

    /**
     * 执行业务
     * @param request
     */
    public void execute(String request){
        System.out.println("ServiceTarget execute request: " + request);
    }

}
