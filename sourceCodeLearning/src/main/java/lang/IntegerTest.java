package lang;

public class IntegerTest {
//    static{
//        Properties properties = new Properties();
//        properties.setProperty("java.lang.Integer.IntegerCache.high","200");
//        sun.misc.VM.saveAndRemoveProperties(properties);
//    }
    public static void main(String[] args) {
//        String s1 = Integer.toString(1);
//        String s2 = Integer.toString(1,2);

//        System.out.println(s1);
        //parseInt(String s, int radix)
        //String s :表示是一个十进制字符串的表示形式
        //int radix: 表示将字符串转化为整数
//        System.out.println(Integer.parseInt("1010",10));


        Integer i1 = 127, i2 = 127, i3 = 128, i4 = 128;
        //IntegerCache
        //当vm初始化的时候，就会创建，并将-128 ~127  之间的数据创建并存到cache里，
        // 每次创建时先检查大小，如果在范围内直接返回，如果超出范围再新建对象
        System.out.println(i1  == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i3  == i4);
        System.out.println(i3.equals(i4));

//        System.out.println(i1.hashCode());

        /*
        parseInt方法返回的是基本类型int

        其他的方法返回的是Integer

        valueOf（String）方法会调用valueOf(int)方法。

        如果只需要返回一个基本类型，而不需要一个对象，可以直接使用Integert.parseInt("123");

        如果需要一个对象，那么建议使用valueOf(),因为该方法可以借助缓存带来的好处。

        如果和进制有关，那么就是用decode方法。

        如果是从系统配置中取值，那么就是用getInteger

        移位的效率比直接乘除的效率要高
        乘法的效率比除法的效率要高
            从效率上看，使用移位指令有更高的效率，因为移位指令占2个机器周期，而乘除法指令占4个机器周期。
            从硬件上看，移位对硬件更容易实现，所以会用移位，移一位就乘2,这种乘法当然考虑移位了。
         */

        System.setProperty("222","223");
        System.out.println(Integer.getInteger("222"));
        //1个int占用四个byte
    }
}
