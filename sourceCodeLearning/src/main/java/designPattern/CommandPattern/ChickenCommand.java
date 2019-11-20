package designPattern.CommandPattern;

/**
 * 具体实现烤鸡类
 */
public class ChickenCommand extends Command {

    public ChickenCommand(Barbecue barbecue) {
        super(barbecue);
    }

    @Override
    public void excuteCommand() {
        super.getBarbecue().makeChicken();
    }
}
