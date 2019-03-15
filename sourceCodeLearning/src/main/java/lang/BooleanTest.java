package lang;

public class BooleanTest {

    public static void main(String[] args) {
//        boolean b = false;
        Boolean t = new Boolean("true");
        Boolean f = new Boolean("false");

        //true hashcode  1231
        //false hashcode 1237


        /**
         * parseBoolean和getBoolean的区别
         */
//        System.out.println(Boolean.parseBoolean("true"));
//        System.out.println(Boolean.getBoolean("true"));
//
//        System.setProperty("user","true");
//        System.out.println(Boolean.parseBoolean("user"));
//        System.out.println(Boolean.getBoolean("user"));

        System.out.println(Boolean.logicalXor(t, f));
        System.out.println(Boolean.logicalXor(f, t));

        //异或的规则是转换成二进制比较，相同为0，不同为1.
        int a=2;
        int b=3;
        //2:
        a=a^b;//a=1
        b=a^b;//b=1
        a=a^b;//a=0
        System.out.println("a="+a+",b="+b);

//        System.out.println(B.hashCode());
    }
}
