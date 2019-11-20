package designPattern.ChainPattern;

public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        this.level = AbstractLogger.INFO;
    }

    @Override
    protected void write(String logMessage) {
        System.out.println("InfoLogger :: info " + logMessage);
    }
}
