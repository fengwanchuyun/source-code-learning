package designPattern.BridgePattern;

public class Circle extends Shape {

    private int i;

    private int j;

    private int radius;

    public Circle(int i,int j,int radius ,DrawApi drawApi) {
        super(drawApi);
        this.i = i;
        this.j = j;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.draw(i,j,radius);
    }
}
