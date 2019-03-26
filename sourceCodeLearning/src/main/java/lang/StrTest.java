package lang;

public class StrTest {
    String str = "hello";
    char[] abc = {'a','b','c'};
    public void exchange(String str,char[] abc){
        str = "good";
        abc[0] = 's';
    }

    public static void main(String[] args) {
        StrTest ex = new StrTest();
        ex.exchange(ex.str,ex.abc);
        System.out.println(ex.str+" and "+ex.abc[0]);

        String str1 = "hello";
        String str2 = "hel"+new String("lo");
        System.out.println(str1 == str2);


//        String str1 = "heLlo world";
//        String str2 = "  hello world1   ";
//        String str2 = new String(str1.toCharArray(), -2, -2);
//        boolean b = str1.contentEquals(str2);

//        String wo = str1.concat("wo");


//        StringJoiner stringJoiner1 = new StringJoiner(":", "{", "}");
//        StringJoiner stringJoiner2 = new StringJoiner(":", "{", "}");
//
//        StringJoiner add1 = stringJoiner1.add("li").add("yang").add("hello");
//        StringJoiner add2 = stringJoiner2.add("li").add("xinhua").add("world");
//        StringJoiner merge = add1.merge(add2);

//        String lowerCase = str1.toLowerCase();
//        String upperCase = lowerCase.toUpperCase();

//        System.out.println(str1.equals(str1.trim()));
//        String.format(str1, );
//        Boolean b = false;
//        String intern = str1.intern();
//        System.out.println(intern);


    }

}
