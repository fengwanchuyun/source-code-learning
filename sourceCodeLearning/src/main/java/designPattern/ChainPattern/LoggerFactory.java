package designPattern.ChainPattern;

public class LoggerFactory {
    public static AbstractLogger getLogger(){
//        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
//        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
//        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
//
//        errorLogger.setNextLogger(debugLogger);
//        debugLogger.setNextLogger(infoLogger);
        return new ErrorLogger();
    }
}
