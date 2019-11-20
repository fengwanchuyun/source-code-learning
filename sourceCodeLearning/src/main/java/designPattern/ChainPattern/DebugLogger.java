package designPattern.ChainPattern;

public class DebugLogger extends AbstractLogger {

    public DebugLogger() {
        this.level = AbstractLogger.DEBUG;
        setNextLogger(new InfoLogger());
    }

    @Override
    protected void write(String logMessage) {
        System.out.println("DebugLogger :: info " + logMessage);
    }
}
