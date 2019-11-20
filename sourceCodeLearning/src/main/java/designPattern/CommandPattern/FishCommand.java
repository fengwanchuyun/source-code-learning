package designPattern.CommandPattern;

public class FishCommand extends Command {
    public FishCommand(Barbecue barbecue) {
        super(barbecue);
    }

    @Override
    public void excuteCommand() {
        super.getBarbecue().makeFish();
    }
}
