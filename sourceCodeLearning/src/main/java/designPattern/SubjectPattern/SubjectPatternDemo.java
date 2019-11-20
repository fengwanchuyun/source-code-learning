package designPattern.SubjectPattern;

/**
 * Observer 模式的定义：该模式定义了对象之间的一对多依赖关系，Subject 对象是一，Observer 对象是多。当 Subject 对象的状态发生改变时，所有依赖于该 Subject 对象的 Observer 对象都会得到通知，并且自动更新。
 *
 * 仔细分析定义，要精确理解观察者模式主要注意三点：
 *
 * 1.定义了对象间的一对多依赖关系；
 *
 * 2.当 Subject 对象的状态发生改变时，所有依赖于该 Subject 对象的 Observer 对象都会得到通知；
 *
 * 3.Observer 对象得到通知后，会自动更新，而不是被动；
 *
 * 其它的所有点都是细枝末节，由具体业务需求来决定。比如：
 *
 * 1. Subject 角色是应该定义成类？比如 内置的 java.util.Observable；还是应该定义成接口，以规避Java不支持多重继承的问题？比如《Head First 设计模式》中的推荐作法。
 *
 * 2.应该在什么时候订阅主题（或者说注册观察者）？是实例化观察者对象的同时？比如贴主的示例；还是由客户自主决定？比如此贴的第一篇分享笔记。
 *
 * 3.是否应该实现取消订阅功能（或者说取消注册）？
 *
 * 4.主题对象通知观察者时，是否携带消息？换句话说，是“推”消息？如贴主示例；还是“拉”消息？
 *
 * 5.是否支持多线程？
 */
public class SubjectPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("update state to 10!");
        subject.setState(10);
    }
}
