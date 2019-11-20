package designPattern.ProxyPattern;

public class Singer implements ISing ,IDance {
    @Override
    public void sing(String songName) {
        System.out.println("Singer sing a song ,songName is :"+songName);
    }

    @Override
    public void dance(String danceName) {

    }
}
