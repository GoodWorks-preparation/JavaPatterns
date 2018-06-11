package com.boonya.pattern.runoob.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: OtherFilter
 * @Description: TODO(功能描述:单身过滤器)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class SingleFilter implements IFilter {

    @Override
    public List<Person> doFilter(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
