package com.boonya.pattern.runoob.filter;

import java.util.List;

/**
 * @ClassName: OrFilter
 * @Description: TODO(功能描述:两个过滤器条件或)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class OrFilter   implements IFilter {

    private IFilter filter;
    private IFilter otherFilter;

    public OrFilter(IFilter filter,IFilter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Person> doFilter(List<Person> persons) {
        List<Person> items = filter.doFilter(persons);
        List<Person> otherItems = otherFilter.doFilter(persons);

        for (Person person : otherItems) {
            if(!items.contains(person)){
                items.add(person);
            }
        }
        return items;
    }
}
