package designPattern.StatePattern;

public class StartState implements State {


    @Override
    public void prepare(Context context) {

    }

    @Override
    public void start(Context context) {
        context.setState(new StartState());
        System.out.println("start state");
    }

    @Override
    public void stop(Context context) {

    }
}
