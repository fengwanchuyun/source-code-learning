package designPattern.MediatorPattern;

public interface Device {
    public void operator(String command,Mediator device);

    public void readyState(String command);


}
