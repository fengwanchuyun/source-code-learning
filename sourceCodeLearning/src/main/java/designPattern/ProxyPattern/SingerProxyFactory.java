package designPattern.ProxyPattern;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class SingerProxyFactory {
    public static ISing getSingerStaticProxy(){
        return new SingreStaticProxy(new Singer());
    }

    public static Object getSingerDynProxy(Object target){
        SingerDynProxy handler = new SingerDynProxy(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
    }

    public static Object getSingerCGLibProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new SingerCGLibProxy());
        return enhancer.create();
    }
}
