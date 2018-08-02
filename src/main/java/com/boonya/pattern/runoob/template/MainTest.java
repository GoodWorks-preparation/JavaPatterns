package com.boonya.pattern.runoob.template;

/**
 * @ClassName: MainTest
 * @Description: TODO(模板测试)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class MainTest {

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
