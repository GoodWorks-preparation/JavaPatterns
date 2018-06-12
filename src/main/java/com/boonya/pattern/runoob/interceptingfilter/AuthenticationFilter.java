package com.boonya.pattern.runoob.interceptingfilter;

/**
 * @ClassName: AuthenticationFilter
 * @Description: TODO(功能描述:权限过滤器)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class AuthenticationFilter implements IFilter {

    @Override
    public void doFilter(String request){
        System.out.println("Authenticating request: " + request);
    }

}
