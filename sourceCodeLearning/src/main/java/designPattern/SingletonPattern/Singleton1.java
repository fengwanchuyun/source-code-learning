package designPattern.SingletonPattern;

public class Singleton1 {
    /**
     *
     * 饿汉式：
     *  是否lazy初始化：否
     *  是否多线程安全： 是
     *       static修饰，在类加载的时候就会被初始化，所以线程安全
     *
     */

    //私有化构造函数，无法通过new Singleton1() 来实例化
    private Singleton1(){

    }

    private static Singleton1 instance = new Singleton1();

    public Singleton1 getInstance(){
        return instance;
    }

    public void getMessage() {
        System.out.println("Singleton1 getMessage success!");
    }
}
