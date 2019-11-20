package designPattern.SubjectPattern;


import java.util.ArrayList;
import java.util.List;

public class Subject {

    private static List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers(state);
    }

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void notifyAllObservers(int state){
        for (Observer observer : observerList) {
            observer.update(state);
        }
    }

}
