package com.boonya.pattern.runoob.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FilterMain
 * @Description: TODO(功能描:测试过滤器模式)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class FilterMain {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        IFilter male = new MaleFilter();
        IFilter female = new FemaleFilter();
        IFilter single = new SingleFilter();
        IFilter singleMale = new AndFilter(single, male);
        IFilter singleOrFemale = new OrFilter(single, female);


        System.out.println("Males: ");
        printPersons(male.doFilter(persons));

        System.out.println("\nFemales: ");
        printPersons(female.doFilter(persons));

        System.out.println("\nSingle persons: ");
        printPersons(single.doFilter(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.doFilter(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.doFilter(persons));

    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }

}
