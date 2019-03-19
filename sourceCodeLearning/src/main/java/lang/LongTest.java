package lang;

public class LongTest {
    public static void main(String[] args) {
//        Long i1 = 127l, i2 = 127l, i3 = 128l, i4 = 128l;
        //LongCache
        //当vm初始化的时候，就会创建，并将-128 ~127  之间的数据创建并存到cache里，
        // 每次创建时先检查大小，如果在范围内直接返回，如果超出范围再新建对象
//        System.out.println(i1  == i2);
//        System.out.println(i1.equals(i2));
//        System.out.println(i3  == i4);
//        System.out.println(i3.equals(i4));

        //1个long 占用8个byte
        Long l = 0x7fffffffffffffffL;
        int hash = l.hashCode();
//        int i = (int) (l >>> 32);
        int j = (int)(l ^ (l >>> 32));
        System.out.println(hash);
        System.out.println(j);
    }
}
