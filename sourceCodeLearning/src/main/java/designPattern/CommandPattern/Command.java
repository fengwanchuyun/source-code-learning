package designPattern.CommandPattern;

/**
 * 命令抽象类
 */
public abstract class Command {

    private Barbecue barbecue;

    public Command(Barbecue barbecue) {
        super();
        this.barbecue = barbecue;
    }

    public void setBarbecue(Barbecue barbecue) {
        this.barbecue = barbecue;
    }

    public Barbecue getBarbecue() {
        return barbecue;
    }

    public abstract void excuteCommand();
}
