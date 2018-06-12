package com.boonya.pattern.runoob.observer;

/**
 * @ClassName: OctalObserver
 * @Description: TODO(功能描述:八进制观察者)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class OctalObserver  extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
