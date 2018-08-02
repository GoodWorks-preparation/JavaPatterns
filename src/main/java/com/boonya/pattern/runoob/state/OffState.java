package com.boonya.pattern.runoob.state;

/**
 * @ClassName: OffState
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class OffState implements State {

    @Override
    public void changeState(Context context) {
        System.out.println("Player is in off state");
        context.setState(this);
    }

    @Override
    public String toString(){
        return "Off State";
    }
}
