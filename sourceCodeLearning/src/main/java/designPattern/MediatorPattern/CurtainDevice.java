package designPattern.MediatorPattern;

/**
 * 电动窗帘
 */
public class CurtainDevice implements Device {

    @Override
    public void operator(String command, Mediator device) {
        System.out.println("curtain is " + command + "!");
        device.bath(command);
    }

    @Override
    public void readyState(String command) {
        System.out.println("curtain is getting " + command + "!");
    }
}
