package designPattern.NullObjectPattern;

/**
 *
 */
public class NullObjectPatternDemo {
    public static void main(String[] args) {
        CustomerFactory factory = new CustomerFactory();
        Customer c111 = factory.getCustomer("111");
        System.out.println(c111.getName());
        Customer c222 = factory.getCustomer("222");
        System.out.println(c222.getName());
        Customer caaa = factory.getCustomer("aaa");
        System.out.println(caaa.getName());
        Customer cccc = factory.getCustomer("ccc");
        System.out.println(cccc.getName());
        Customer cbbb = factory.getCustomer("bbb");
        System.out.println(cbbb.getName());
    }
}
