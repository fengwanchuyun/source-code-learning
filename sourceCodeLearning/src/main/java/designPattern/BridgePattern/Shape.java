package designPattern.BridgePattern;

public abstract class Shape {
    DrawApi drawApi;

    public Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }
    public abstract void draw();
}
