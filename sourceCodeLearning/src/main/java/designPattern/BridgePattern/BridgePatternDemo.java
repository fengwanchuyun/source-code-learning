package designPattern.BridgePattern;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 *
 * https://www.cnblogs.com/betterboyz/p/9361784.html
 *
 * 意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
 *
 * 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
 *
 * 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。
 *
 * 如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
 *
 * 关键代码：抽象类依赖实现类。
 *
 * 应用实例： 1、猪八戒从天蓬元帅转世投胎到猪，转世投胎的机制将尘世划分为两个等级，即：灵魂和肉体，前者相当于抽象化，后者相当于实现化。
 *              生灵通过功能的委派，调用肉体对象的功能，使得生灵可以动态地选择。
 *          2、墙上的开关，可以看到的开关是抽象的，不用管里面具体怎么实现的。
 *
 * 优点： 1、抽象和实现的分离。 2、优秀的扩展能力。 3、实现细节对客户透明。
 *
 * 缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 *
 * 使用场景： 1、如果一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性，避免在两个层次之间建立静态的继承联系，
 *              通过桥接模式可以使它们在抽象层建立一个关联关系。
 *          2、对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。
 *          3、一个类存在两个独立变化的维度，且这两个维度都需要进行扩展。
 *
 * 注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了。
 *
 *
 * 桥梁模式在Java应用中的一个非常典型的例子就是JDBC驱动器。JDBC为所有的关系型数据库提供一个通用的界面。一个应用系统动态地选择一个合适的驱动器，然后通过驱动器向数据库引擎发出指令
 * 。这个过程就是将抽象角色的行为委派给实现角色的过程。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
//        Circle redCircle = new Circle(100, 100, 30, new RedCircle());
//        Circle greenCircle = new Circle(100, 100, 20, new GreenCircle());
//        Circle blackCircle = new Circle(100, 100, 10, new BlackCircle());
//        redCircle.draw();
//        greenCircle.draw();
//        blackCircle.draw();
//        StringBuilder buf = new StringBuilder();
//        buf.append(' ');
//        for (int i = 0; i < 1000; ++i) {
//            buf.append((char) 160);
//        }

//        String s1 = buf.toString();
        String s1 = "  11  ";
        Vo vo = new Vo();
        vo.setField1(s1);
        vo.setField2(s1);
        vo.setField3(s1);
        vo.setField4(s1);
        vo.setField5(s1);
        vo.setField6(s1);
        vo.setField7(s1);
        vo.setField8(s1);
        vo.setField9(s1);
        vo.setField_10(" ");

        String s = JSONObject.toJSONString(vo);
        System.out.println(s);

    }
}
