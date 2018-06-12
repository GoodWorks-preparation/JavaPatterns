package com.boonya.pattern.runoob.iterator;

/**
 * @ClassName: IteratorMain
 * @Description: TODO(功能描述:迭代器测试)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class IteratorMain {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iterator = namesRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
