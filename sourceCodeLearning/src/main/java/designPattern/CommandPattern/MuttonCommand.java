package designPattern.CommandPattern;

public class MuttonCommand extends Command {
    public MuttonCommand(Barbecue barbecue) {
        super(barbecue);
    }

    @Override
    public void excuteCommand() {
        super.getBarbecue().makeMutton();
    }
}
