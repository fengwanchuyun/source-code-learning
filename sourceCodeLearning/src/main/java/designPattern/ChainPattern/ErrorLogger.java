package designPattern.ChainPattern;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger() {
        this.level = AbstractLogger.ERROR;
        setNextLogger(new DebugLogger());
    }

    @Override
    protected void write(String logMessage) {
        System.out.println("ErrorLogger :: info " + logMessage);

    }
}
