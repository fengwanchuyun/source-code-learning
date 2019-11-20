package designPattern.DecoratorPattern;

public class DecoratorShape implements Shape {

    protected Shape shape;

    public DecoratorShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
    }
}
