package designPattern.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SingerDynProxy implements InvocationHandler {

    protected Object singer;

    public SingerDynProxy(Object singer) {
        this.singer = singer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("下面有请周结巴为大家演唱歌曲！");
        Object invoke = method.invoke(singer, args);
        System.out.println("周结巴演唱完毕，大家鼓掌！");
        return invoke;
    }
}
