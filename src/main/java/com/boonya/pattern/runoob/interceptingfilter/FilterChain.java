package com.boonya.pattern.runoob.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FilterChain
 * @Description: TODO(功能描述:拦截过滤器链)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class FilterChain {

    private List<IFilter> filters = new ArrayList<IFilter>();
    private ServiceTarget target;

    public void addFilter(IFilter filter){
        filters.add(filter);
    }

    /**
     * 批量过滤器
     * @param request
     */
    public void doFilter(String request){
        for (IFilter filter : filters) {
            filter.doFilter(request);
        }
        // 执行具体的业务
        target.execute(request);
    }

    public void setTarget(ServiceTarget target){
        this.target = target;
    }
}
