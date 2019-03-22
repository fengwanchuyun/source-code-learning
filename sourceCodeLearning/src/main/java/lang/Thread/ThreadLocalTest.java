package lang.Thread;

public class ThreadLocalTest {
    public static void main(String[] args) {
        //ThreadLocal的作用是提供线程内的局部变量，这种变量在线程的生命周期内起作用。
        // 作用：提供一个线程内公共变量（比如本次请求的用户信息），减少同一个线程内多个函数或者组件之间一些公共变量的传递的复杂度，
        // 或者为线程提供一个私有的变量副本，这样每一个线程都可以随意修改自己的变量副本，而不会对其他线程产生影响。



        //ThreadLocal的内存泄露问题
        //JDK建议将ThreadLocal变量定义成private static的，这样的话ThreadLocal的生命周期就更长，由于一直存在ThreadLocal的强引用，
        // 所以ThreadLocal也就不会被回收，也就能保证任何时候都能根据ThreadLocal的弱引用访问到Entry的value值，然后remove它，防止内存泄露。


        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("MainThreadValue");
        System.out.println(Thread.currentThread().getName()+"======="+threadLocal.get());

        new Thread(new Runnable(){
            @Override
            public void run() {
                threadLocal.set("Thread1Value");
                System.out.println(Thread.currentThread().getName()+"======="+threadLocal.get());
            }
        }).start();
        new Thread(new Runnable(){
            @Override
            public void run() {
                threadLocal.set("Thread2Value");
                System.out.println(Thread.currentThread().getName()+"======="+threadLocal.get());
            }
        }).start();


    }











    /**
     * 位运算补充
     * 1.位异或运算（^）
     *  运算规则是：两个数转为二进制，然后从高位开始比较，如果相同则为0，不相同则为1。
     * 2.位与运算符（&）
     *  运算规则：两个数都转为二进制，然后从高位开始比较，如果两个数都为1则为1，否则为0。
     * 3.位或运算符（|）
     *  两个数都转为二进制，然后从高位开始比较，两个数只要有一个为1则为1，否则就为0。
     * 4.位非运算符（~）
     *  运算规则：如果位为0，结果是1，如果位为1，结果是0.
     */
}
