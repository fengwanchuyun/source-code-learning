package designPattern.BridgePattern;

public class RedCircle implements DrawApi {

    @Override
    public void draw(int i, int j, int radius) {
        System.out.println("draw red circle i:"+i+";j:"+j+";radius:"+radius);
    }
}
