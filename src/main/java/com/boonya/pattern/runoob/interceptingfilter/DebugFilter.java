package com.boonya.pattern.runoob.interceptingfilter;

/**
 * @ClassName: DebugFilter
 * @Description: TODO(功能描述:调试过滤器)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class DebugFilter  implements IFilter {

    @Override
    public void doFilter(String request){
        System.out.println("Debug request: " + request);
    }
}
