package designPattern.SubjectPattern;


public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(int state) {
        System.out.println("HexaObserver update! hex :"+Integer.toHexString(state));

    }
}
