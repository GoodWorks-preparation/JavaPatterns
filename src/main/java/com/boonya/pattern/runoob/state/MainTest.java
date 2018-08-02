package com.boonya.pattern.runoob.state;

/**
 * @ClassName: MainTest
 * @Description: TODO(状态模式测试)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class MainTest {

    public static void main(String[] args) {
        Context context = new Context();

        OnState onState = new OnState();
        onState.changeState(context);

        System.out.println(context.getState().toString());

        OffState offState = new OffState();
        offState.changeState(context);

        System.out.println(context.getState().toString());
    }
}
