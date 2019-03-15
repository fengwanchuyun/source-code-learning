package lang;

public class StringBufferTest {

    public static void main(String[] args) {
        //线程安全，是因为提供的public的方法中，均用synchronzied关键字修饰
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("abcdefg");
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse.toString());
    }

}
