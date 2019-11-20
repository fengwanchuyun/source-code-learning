package designPattern.NullObjectPattern;

public class CustomerFactory {
    private static String[] nameArr = {"aaa","bbb","ccc","ddd"};

    public Customer getCustomer(String name){
        for (String nameStr : nameArr) {
            if(nameStr.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
