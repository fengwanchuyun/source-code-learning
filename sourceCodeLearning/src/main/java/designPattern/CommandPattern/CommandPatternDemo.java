package designPattern.CommandPattern;

public class CommandPatternDemo {
    /**
     *命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。请求以命令的形式包裹在对象中，并传给调用对象。
     *      调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
     */

    public static void main(String[] args) {
        Barbecue barbecue = new Barbecue();
        Command fishCommand = new FishCommand(barbecue);
        ChickenCommand chickenCommand = new ChickenCommand(barbecue);
        MuttonCommand muttonCommand = new MuttonCommand(barbecue);

        Waiter waiter = new Waiter();
        waiter.add(muttonCommand,"先点一份烤全羊尝尝");
        waiter.add(chickenCommand,"一只羊不够吃，再来只鸡");
        waiter.add(fishCommand,"听说鱼也挺新鲜，来一份尝尝");
        waiter.remove(fishCommand,"上菜太慢了，吃饱了");
        waiter.doCommand();

    }
}
