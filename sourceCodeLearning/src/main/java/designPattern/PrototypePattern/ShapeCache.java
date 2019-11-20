package designPattern.PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> cache = new Hashtable<>();

    public static Shape getShape(String shapeId){
        Shape shape = cache.get(shapeId);
        return (Shape) shape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        cache.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        cache.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        cache.put(rectangle.getId(),rectangle);

    }
}
