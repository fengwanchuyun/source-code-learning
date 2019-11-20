package designPattern.SingletonPattern;

public class Singleton4 {
    /**
     *
     * 双重校验锁
     *  是否lazy初始化：是
     *  是否线程安全：是
     */

    private Singleton4(){}

    private volatile static Singleton4 instance;

    public Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void getMessage() {
        System.out.println("Singleton4 getMessage success!");
    }

}
