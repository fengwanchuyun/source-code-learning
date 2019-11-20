package designPattern.ChainPattern;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String logMessage){
        if(this.level <= level){
            write(logMessage);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,logMessage);
        }
    }

    abstract protected void write(String message);

}
