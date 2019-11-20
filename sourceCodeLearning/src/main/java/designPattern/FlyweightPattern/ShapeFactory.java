package designPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String,Shape> shapeCache = new HashMap<>();

    public static Circle getCircle(String color){
        Circle circle = (Circle) shapeCache.get(color);
        if(circle == null){
            circle = new Circle(color);
            shapeCache.put(color,circle);
            System.out.println("Create Circle color:"+color);
        }
        return circle;
    }

}
