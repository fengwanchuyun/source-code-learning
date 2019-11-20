package designPattern.SingletonPattern;

public class Singleton3 {
    /**
     *
     * 懒汉式：
     *  是否lazy加载：是
     *  是否线程安全：是|但是synchronized加在方法上，会导致每次调用都会上锁，占用资源多影响效率
     */

    private Singleton3(){}

    private static Singleton3 instance;

    public synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }

    public void getMessage() {
        System.out.println("Singleton3 getMessage success!");
    }

}
