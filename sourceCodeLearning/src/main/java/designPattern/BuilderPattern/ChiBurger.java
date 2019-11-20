package designPattern.BuilderPattern;

public class ChiBurger extends Burger {

    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
