package com.boonya.pattern.runoob.adapter;

/**
 * @ClassName: VlcPlayer
 * @Description: TODO(功能描述:实现VLC播放器)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class VlcPlayer  implements IAdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //nothing to do
    }
}
