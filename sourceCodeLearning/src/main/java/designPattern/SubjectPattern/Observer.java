package designPattern.SubjectPattern;

public abstract class Observer {
    protected  Subject subject;

    public abstract void update(int state);
}
