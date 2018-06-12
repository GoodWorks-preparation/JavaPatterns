package com.boonya.pattern.runoob.observer;

/**
 * @ClassName: HexaObserver
 * @Description: TODO(功能描述:HEX码观察者)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-12
 */
public class HexaObserver  extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
