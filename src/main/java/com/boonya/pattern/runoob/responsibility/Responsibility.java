package com.boonya.pattern.runoob.responsibility;

/**
 * @ClassName: Responsibility
 * @Description: TODO(责任链模式)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class Responsibility {

        public static AbstractLogger getChainOfLoggers(){

            AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
            AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
            AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

            errorLogger.setNextLogger(fileLogger);
            fileLogger.setNextLogger(consoleLogger);

            return errorLogger;
        }
}
