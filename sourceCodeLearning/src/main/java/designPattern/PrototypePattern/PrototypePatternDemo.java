package designPattern.PrototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("clonedShape1 type : " + clonedShape1.type);

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("clonedShape2 type : " + clonedShape2.type);

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("clonedShape3 type : " + clonedShape3.type);
    }
}
