package com.boonya.pattern.runoob.responsibility;

/**
 * @ClassName: MainTest
 * @Description: TODO(测试责任模式)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-08-02
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractLogger loggerChain = Responsibility.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
