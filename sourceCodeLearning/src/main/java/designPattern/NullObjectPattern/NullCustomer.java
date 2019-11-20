package designPattern.NullObjectPattern;

public class NullCustomer extends Customer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public Boolean isNull() {
        return true;
    }
}
