package designPattern.MediatorPattern;

/**
 * 中介者模式
 *  高内聚，低耦合，使用中介者明显降低了对象之间的耦合
 *  通过让对象彼此解耦，增加对象的复用性
 *  通过将控制逻辑集中，可以简化系统维护
 *  通过中介者使一对所变成了一堆一，便于理解
 *  缺点：中介者会庞大，变得复杂难以维护。
 *
 * 使用场景：
 *    1、系统中对象之间存在比较复杂的引用关系，导致它们之间的依赖关系结构混乱而且难以复用该对象。
 *    2、想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。
 *
 * 注意事项：不应当在职责混乱的时候使用。
 *
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        MediatorDevice mediatorDevice = new MediatorDevice();
        //小明家实现了万物互联
        //小明要洗澡，这时他先启动了窗帘
        mediatorDevice.bathDevice.operator("open",mediatorDevice);
        //小明洗完澡，关闭了音乐
        mediatorDevice.musicDevice.operator("close",mediatorDevice);

    }
}
