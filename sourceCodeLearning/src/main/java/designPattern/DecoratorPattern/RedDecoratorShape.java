package designPattern.DecoratorPattern;

public class RedDecoratorShape extends DecoratorShape {
    public RedDecoratorShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        shape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border color:red");
    }

}
