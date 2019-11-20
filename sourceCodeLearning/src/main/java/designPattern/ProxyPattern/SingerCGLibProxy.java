package designPattern.ProxyPattern;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class SingerCGLibProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equals("sing")){
            System.out.println("成功邀请到国际巨星娱乐圈半边天-汪峰老师！");
        }
        Object result = methodProxy.invokeSuper(o, args);
        return result;
    }
}
