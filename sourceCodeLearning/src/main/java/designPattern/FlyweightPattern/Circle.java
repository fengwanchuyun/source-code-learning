package designPattern.FlyweightPattern;

public class Circle implements Shape {

    private String color;
    private int x,y,radius;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle::color:"+color+",X:"+x+",Y"+y+",radius:"+radius);
    }
}
