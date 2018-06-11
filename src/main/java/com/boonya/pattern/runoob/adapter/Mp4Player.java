package com.boonya.pattern.runoob.adapter;

/**
 * @ClassName: Mp4Player
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class Mp4Player  implements IAdvanceMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //nothing to do
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
