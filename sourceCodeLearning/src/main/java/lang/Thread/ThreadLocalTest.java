package lang.Thread;

public class ThreadLocalTest {
    public static void main(String[] args) {
        //ThreadLocal的作用是提供线程内的局部变量，这种变量在线程的生命周期内起作用。
        // 作用：提供一个线程内公共变量（比如本次请求的用户信息），减少同一个线程内多个函数或者组件之间一些公共变量的传递的复杂度，
        // 或者为线程提供一个私有的变量副本，这样每一个线程都可以随意修改自己的变量副本，而不会对其他线程产生影响。



        //ThreadLocal的内存泄露问题
        //JDK建议将ThreadLocal变量定义成private static的，这样的话ThreadLocal的生命周期就更长，由于一直存在ThreadLocal的强引用，
        // 所以ThreadLocal也就不会被回收，也就能保证任何时候都能根据ThreadLocal的弱引用访问到Entry的value值，然后remove它，防止内存泄露。

        //解决hash冲突的方式效率低



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


    // java计算位置普遍用到 int index = hashCode & (length-1)
    //  HashMap  ThreadLocalMap中entry[]等
    // 其中 length必须为2的幂次方
    //      原因：只有这样，length-1得到的二进制，除了高位为0，其他位都为1111；这样hashCode & (length-1)计算出来的值就是hashCode的N低位
    //          在少量数据的情况下，会均匀分布，避免hash冲突。
    //      当length不为2的幂次方时，length-1对应的二进制中，除高位以外，低位中肯定有一个是0，那么无论hashCode对应的那位为0或1，位与运算的结果都是0
    //      这样会导致分布不均匀，并导致数组中一些位置永远不会被使用
    //  HashMap的加载因子为什么是0.75
    //  官方给的注释：是在理想情况下,使用随机哈希码,节点出现的频率在hash桶中遵循泊松分布，同时给出了桶中元素个数和概率的对照表。
    //      0: 0.60653066
    //      1: 0.30326533
    //      2: 0.07581633
    //      3: 0.01263606
    //      4: 0.00157952
    //      5: 0.00015795
    //      6: 0.00001316
    //      7: 0.00000094
    //      8: 0.00000006
    //  看到当桶中元素到达8个的时候，概率已经变得非常小，也就是说用0.75作为加载因子，每个碰撞位置的链表长度超过８个是几乎不可能的


    /**
     * ThreadLocal是如何为Thread创建副本的？()
     * 1.首先，每一个Thread内部都有一个ThreadLocal.ThreadLocalMap类型的成员变量 threadLocals，threadLocals就是用来存储各个变量副本的
     *      key是当前的ThreadLocal,value是变量副本
     * 2.初始化时，Thread里的threadLocals是null,当通过ThreadLocal调用get(Thread t)或set(Thread t)方法时，会对Thread t中的threadLocals进行初始化
     *      并以当前的ThreadLocal为Key，以ThreadLocal要保存的变量副本为value,保存到threadLocals中
     * 3.在当前线程中，如果要使用变量副本，可以通过get()获取
     */







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
