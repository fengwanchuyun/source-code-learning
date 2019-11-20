package designPattern.SingletonPattern;

public class Singleton2 {
    /**
     *
     * 懒汉式：
     *  是否lazy加载：是
     *  是否线程安全：否
     *
     */

    private Singleton2(){}

    private static Singleton2 instance;

    public Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

    public void getMessage() {
        System.out.println("Singleton2 getMessage success!");
    }


}
