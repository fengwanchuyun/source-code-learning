package designPattern.FecadePattern;

public class ShapeFecade {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeFecade() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
