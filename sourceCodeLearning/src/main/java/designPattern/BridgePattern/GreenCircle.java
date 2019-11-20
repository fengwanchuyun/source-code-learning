package designPattern.BridgePattern;

public class GreenCircle implements DrawApi {
    @Override
    public void draw(int i, int j, int radius) {
        System.out.println("draw green circle i:"+i+";j:"+j+";radius:"+radius);

    }
}
