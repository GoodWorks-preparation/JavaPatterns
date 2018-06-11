package com.boonya.pattern.runoob.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FilterChain
 * @Description: TODO(功能描述:多过滤器链式实现)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class FilterChain {

    private List<Person> persons;

    private List<IFilter> filters=new ArrayList<IFilter>();

    public  void setData(List<Person> persons)
    {
        this.persons=persons;
    }

    public  List<Person> getData()
    {
        return persons;
    }

    /**
     * 添加过滤器
     * @param filter
     */
    public void addFilter(IFilter filter){
        filters.add(filter);
    }

    /**
     * 多过滤器链实现一
     * @param persons
     * @return
     */
    public  List<Person> doFilter(List<Person> persons){
        if(filters.size()==0){
            throw  new RuntimeException("No filters,please call addFilter() !");
        }
        for (IFilter filter: filters) {
            persons=filter.doFilter(persons);
        }
        return persons;
    }

    /**
     * 多过滤器实现二
     * @param filter
     * @return
     */
    public FilterChain doFilter(IFilter filter){
        if(persons==null){
            throw  new RuntimeException("No data,please call setData() first!");
        }
        persons=filter.doFilter(persons);
        return this;
    }
}
