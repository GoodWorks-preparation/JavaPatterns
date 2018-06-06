package com.boonya.pattern.runoob.responsibility;

/**
 * @ClassName: Responsibility
 * @Description: TODO(责任链模式)
 * @author: pengjunlin
 * @company: 上海势航网络科技有限公司
 * @date 2018-06-06
 */
public class Responsibility {

        private static AbstractLogger getChainOfLoggers(){

            AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
            AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
            AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

            errorLogger.setNextLogger(fileLogger);
            fileLogger.setNextLogger(consoleLogger);

            return errorLogger;
        }

        public static void main(String[] args) {
            AbstractLogger loggerChain = getChainOfLoggers();

            loggerChain.logMessage(AbstractLogger.INFO,
                    "This is an information.");

            loggerChain.logMessage(AbstractLogger.DEBUG,
                    "This is an debug level information.");

            loggerChain.logMessage(AbstractLogger.ERROR,
                    "This is an error information.");
        }
}
