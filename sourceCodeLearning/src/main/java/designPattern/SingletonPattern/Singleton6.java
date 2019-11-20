package designPattern.SingletonPattern;

public class Singleton6 {
    /**
     *
     * 通过内部枚举实现
     *  是否 Lazy 初始化：否
     *  是否多线程安全：是
     *
     */
    private Singleton6(){}

    enum Singleton6Enum{
        /**
         *
         */
        INSTANCE;
        private Singleton6 instance;

        Singleton6Enum() {
            instance = new Singleton6();
        }
        public Singleton6 getInstance(){
            return instance;
        }
    }

    public static Singleton6 getInstance(){
        return Singleton6Enum.INSTANCE.getInstance();
    }


}
