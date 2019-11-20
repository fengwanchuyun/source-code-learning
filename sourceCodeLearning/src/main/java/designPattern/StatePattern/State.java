package designPattern.StatePattern;

public interface State {
    public void prepare(Context context);

    public void start(Context context);

    public void stop(Context context);
}
