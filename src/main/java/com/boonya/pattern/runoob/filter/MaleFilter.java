package com.boonya.pattern.runoob.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MaleFilter
 * @Description: TODO(功能描述:男性过滤器)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class MaleFilter implements IFilter {

    @Override
    public List<Person> doFilter(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
