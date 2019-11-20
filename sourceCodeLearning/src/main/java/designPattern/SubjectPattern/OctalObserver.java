package designPattern.SubjectPattern;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("OctalObserver update! octal :"+Integer.toOctalString(state));

    }
}
