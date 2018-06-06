package com.boonya.pattern.application.responsibility;

/**
 * @ClassName: MainTest
 * @Description: TODO(功能描述:测试入口_参考Java设计模式责任链模式:https://blog.csdn.net/u012810020/article/details/71194853)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class MainTest {

    /*
     *函数入口
     */
    public static void main(String[] args) {

        Request request = new Request.Builder().setName("张三").setDays(5)
                .setReason("事假").build();
        ResponsibilityChainUtil client = new ResponsibilityChainUtil();
        Result result = client.execute(request);

        System.out.println("结果：" + result.toString());


        /*******************自定义责任人测试***************/
        client.addRatifys(new CustomInterceptor());
        Result result2 = client.execute(request);

        System.out.println("结果2：" + result2.toString());
    }
}
