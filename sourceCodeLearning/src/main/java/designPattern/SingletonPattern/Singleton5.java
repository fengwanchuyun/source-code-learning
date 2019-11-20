package designPattern.SingletonPattern;

public class Singleton5 {
    /**
     *
     *  静态内部类
     *      是否Lazy加载：是
     *      是否线程安全: 是
     */
    private Singleton5(){}

    private static class SINGLEHOLDER{
        private static final Singleton5 instance = new Singleton5();
    }

    public static final Singleton5 getInstance(){
        return SINGLEHOLDER.instance;
    }

}
