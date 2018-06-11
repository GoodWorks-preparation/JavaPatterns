package com.boonya.pattern.runoob.adapter;

/**
 * @ClassName: MediaAdapter
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-11
 */
public class MediaAdapter  implements IMediaPlayer {

    IAdvanceMediaPlayer advanceMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advanceMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advanceMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMusicPlayer.playMp4(fileName);
        }
    }
}
