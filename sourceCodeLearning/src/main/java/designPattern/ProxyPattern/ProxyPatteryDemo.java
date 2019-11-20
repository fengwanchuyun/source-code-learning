package designPattern.ProxyPattern;

public class ProxyPatteryDemo {
    /**
     * 静态代理
     *      静态代理是指预先确定了代理与被代理者的关系，例如王二狗的代理律师方文镜是在开庭前就确定的了。
     *          那映射到编程领域的话，就是指代理类与被代理类的依赖关系在编译期间就确定了。
     */
    public static void main(String[] args) {
        //静态代理
//        SingerProxyFactory.getSingerStaticProxy().sing("星晴");

        //动态代理 java自身提供的动态代理
        ISing singer = (ISing) SingerProxyFactory.getSingerDynProxy(new Singer());
        singer.sing("青花瓷");
        
        //动态代理 CGLib
        //CGLIB原理：动态生成一个要代理类的子类，子类重写要代理的类的所有不是final的方法。在子类中采用方法拦截的技术拦截所有父类方法的调用，顺势织入横切逻辑。它比使用java反射的JDK动态代理要快。
        //CGLIB底层：使用字节码处理框架ASM，来转换字节码并生成新的类。不鼓励直接使用ASM，因为它要求你必须对JVM内部结构包括class文件的格式和指令集都很熟悉。
        //CGLIB缺点：对于final方法，无法进行代理。
        SingerCGLib singerCGLib = (SingerCGLib) SingerProxyFactory.getSingerCGLibProxy(new SingerCGLib());
        singerCGLib.sing("双节棍");
    }
}
