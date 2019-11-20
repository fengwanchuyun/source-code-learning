package designPattern.MediatorPattern;

public abstract class Mediator {
    BathDevice bathDevice;
    MusicDevice musicDevice;
    CurtainDevice curtainDevice;

    public Mediator(BathDevice bathDevice, MusicDevice musicDevice, CurtainDevice curtainDevice) {
        super();
        this.bathDevice = bathDevice;
        this.musicDevice = musicDevice;
        this.curtainDevice = curtainDevice;
    }

    public abstract void music(String command);
    public abstract void bath(String command);
    public abstract void curtain(String command);


}
