package designPattern.NullObjectPattern;

public class RealCustomer extends Customer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Boolean isNull() {
        return false;
    }
}
