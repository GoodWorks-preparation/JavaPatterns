package com.boonya.pattern.runoob.filter;

import java.util.List;

/**
 * @ClassName: AddFilter
 * @Description: TODO(功能描述:同时满足两个过滤器)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class AndFilter implements IFilter {

    private IFilter filter;
    private IFilter otherFilter;

    public AndFilter(IFilter filter, IFilter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> doFilter(List<Person> persons) {
        persons = filter.doFilter(persons);
        return otherFilter.doFilter(persons);
    }
}
