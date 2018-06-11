package com.boonya.pattern.runoob.filter;

import java.util.List;

/**
 * @ClassName: IFilter
 * @Description: TODO(功能描述:过滤器接口)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public interface IFilter {

    /**
     * 过滤方法
     * @param persons
     * @return
     */
    public List<Person> doFilter(List<Person> persons);
}
