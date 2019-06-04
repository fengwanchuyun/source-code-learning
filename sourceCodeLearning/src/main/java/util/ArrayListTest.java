package util;


public class ArrayListTest {

    //ArrayList 是一个数组队列，相当于 动态数组。与Java中的数组相比，它的容量能动态增长(可自动扩容，不可自动缩容)。它继承于AbstractList，实现了List, RandomAccess, Cloneable, java.io.Serializable这些接口。
    //
    //ArrayList 继承了AbstractList，实现了List。它是一个数组队列，提供了相关的添加、删除、修改、遍历等功能。
    //ArrayList 实现了RandmoAccess接口，即提供了随机访问功能。RandmoAccess是java中用来被List实现，为List提供快速访问功能的。在ArrayList中，我们即可以通过元素的序号快速获取元素对象；这就是快速随机访问。稍后，我们会比较List的“快速随机访问”和“通过Iterator迭代器访问”的效率。
    //
    //ArrayList 实现了Cloneable接口，即覆盖了函数clone()，能被克隆。
    //
    //ArrayList 实现java.io.Serializable接口，这意味着ArrayList支持序列化，能通过序列化去传输。
    //
    //
    //
    //和Vector不同，ArrayList中的操作不是线程安全的！所以，建议在单线程中才使用ArrayList，而在多线程中可以选择Vector或者CopyOnWriteArrayList。
    //
    //遍历ArrayList时，使用随机访问(即，通过索引序号访问)效率最高，而使用迭代器的效率最低！
    //  for(int i=0;i<size;i++)   >   for(String value:list)   >  iterator

    //transient 关键字  修饰的字段不会被序列化
    //System.arraycopy(a, 0, elementData, size, numNew);
    //，System.arraycopy() 在拷贝数组的时候，采用的使用潜复制，复制结果是一维的引用变量传递给副本的一维数组，修改副本时，会影响原来的数组。

    //add 方法扩容时
    //int newValue = oldValue + (oldValue >> 1);  左移一位等于0.5倍，扩容后的容量是之前的1.5倍



    public static void main(String[] args) {

        int oldValue = 19;
        int newValue = oldValue + (oldValue >> 1);
        System.out.println(newValue);

    }
}
