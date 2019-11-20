package designPattern.StatePattern;

public class PrepareState implements State {

    @Override
    public void prepare(Context context) {
        context.setState(new PrepareState());
        System.out.println("prepare state");
    }

    @Override
    public void start(Context context) {

    }

    @Override
    public void stop(Context context) {

    }
}
