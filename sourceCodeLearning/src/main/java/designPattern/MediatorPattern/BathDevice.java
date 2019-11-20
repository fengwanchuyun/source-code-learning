package designPattern.MediatorPattern;

public class BathDevice implements Device {


    @Override
    public void operator(String command, Mediator device) {
        System.out.println("bath is " + command + "!");
        device.bath(command);
    }

    @Override
    public void readyState(String command) {
        System.out.println("bath is getting " + command + "!");
    }
}
