package com.boonya.pattern.runoob.interceptingfilter;

/**
 * @ClassName: FilterManager
 * @Description: TODO(功能描述:过滤器管理类)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(ServiceTarget target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(IFilter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.doFilter(request);
    }
}
