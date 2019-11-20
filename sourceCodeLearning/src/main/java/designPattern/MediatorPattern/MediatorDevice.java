package designPattern.MediatorPattern;

public class MediatorDevice extends Mediator{

    public MediatorDevice() {
        super(new BathDevice(), new MusicDevice(), new CurtainDevice());
    }

    @Override
    public void music(String command) {
        bathDevice.readyState(command);
        curtainDevice.readyState(command);
    }

    @Override
    public void bath(String command) {
        musicDevice.readyState(command);
        curtainDevice.readyState(command);
    }

    @Override
    public void curtain(String command) {
        bathDevice.readyState(command);
        musicDevice.readyState(command);
    }


}
