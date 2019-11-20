package designPattern.BridgePattern;

public class BlackCircle implements DrawApi {
    @Override
    public void draw(int i, int j, int radius) {
        System.out.println("draw black circle i:"+i+";j:"+j+";radius:"+radius);
    }
}
