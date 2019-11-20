package designPattern.ProxyPattern;

public class SingreStaticProxy implements ISing{

    private ISing singer;

    public SingreStaticProxy(ISing singer) {
        this.singer = singer;
    }

    @Override
    public void sing(String songName) {
        System.out.println("演出开始！下面有请周杰伦为大家表演！");
        singer.sing(songName);
        System.out.println("演唱结束！大家鼓掌！");

    }
}
