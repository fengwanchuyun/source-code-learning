package lang;

/**
 * @ClassName ObjTest
 * @Description
 * @Auther bangbang
 * @Date 2019-03-09 18:14
 * @Version 1.0
 */

public class ObjTest implements Cloneable{

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjTest o1 = new ObjTest();

        /*
         * @Description test equals()
         * @Date 19:01 2019-03-09
         * @Param [args]
         * @return void
         **/
//        String s1 = o1.toString();
//        String name = o1.getClass().getName();
//        String s = Integer.toHexString(o1.hashCode());
//
//        String s2 = name+"@"+s;
//        System.out.println(s1==s2);
//        boolean equals = s1.equals(s2);
//        System.out.println(equals);

        /*
         * @Description test clone()
         * @Date 19:02 2019-03-09
         * @Param [args]
         * @return void
         **/
//        String str1 = (String) o;
//        o1.setId(1);
//        o1.setName("liyang");
//        o1.setAge(28);
//        ObjTest o2 = (ObjTest) o1.clone();
//        boolean b1 = o1 == o2;
//        boolean b2 = o1.equals(o2);
//        System.out.println("o2.id="+o2.getId());
//        System.out.println("o2.name="+o2.getName());
//        System.out.println("o2.age="+o2.getAge());

//        System.runFinalization();


    }

}
