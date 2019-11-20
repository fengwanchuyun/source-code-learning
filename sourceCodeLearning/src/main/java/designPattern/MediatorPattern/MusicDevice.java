package designPattern.MediatorPattern;

public class MusicDevice implements Device {

    @Override
    public void operator(String command, Mediator device) {
        System.out.println("music is " + command + "!");
        device.bath(command);
    }

    @Override
    public void readyState(String command) {
        System.out.println("music is getting " + command + "!");
    }
}
