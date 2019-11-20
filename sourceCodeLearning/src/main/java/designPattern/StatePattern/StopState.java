package designPattern.StatePattern;

public class StopState implements State {

    @Override
    public void prepare(Context context) {

    }

    @Override
    public void start(Context context) {

    }

    @Override
    public void stop(Context context) {
        context.setState(new StopState());
        System.out.println("stop state");
    }
}
