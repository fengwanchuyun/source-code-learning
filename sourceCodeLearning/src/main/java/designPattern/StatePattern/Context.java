package designPattern.StatePattern;

public class Context {
    private State state;

    public State getState() {
        if(this.state == null){
            return  new PrepareState();
        }
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void prepare() {
        if (getState() instanceof PrepareState) {
            getState().prepare(this);
        }else {
            System.out.println("already in prepare state");
        }
    }

    public void start(){
        if(getState() instanceof StartState){
            getState().start(this);
        }else {
            System.out.println("already in start state");
        }
    }

    public void stop(){
        if(getState() instanceof StopState){
            getState().stop(this);
        }else {
            System.out.println("already in stop state");
        }
    }
}
