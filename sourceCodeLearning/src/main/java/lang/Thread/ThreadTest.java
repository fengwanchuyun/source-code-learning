package lang.Thread;

import java.util.ArrayList;

public class ThreadTest {

    private static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
//        Thread thread = Thread.currentThread();
//        thread.setName("no_main");
//        String name = thread.getName();
//        System.out.println(name);

        //一个是由JVM启动的main线程，另外一个则是我们自己创建的线程thread，运行上面的这段代码，你会发现JVM进程永远不会退出，
        // 即使main线程正常地结束了自己的生命周期（main线程的生命周期是从注释①到注释④之间的那段代码），
        // 原因就是因为在JVM进程中还存在一个非守护线程在运行。
//        Thread thread = new Thread(()->{
//            while (true){
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        //②将thread设置为守护线程
////        thread.setDaemon(true);
//        //③启动thread线程
//        thread.start();
//        Thread.sleep(2000L);
//        System.out.println("Main thread finished lifecycle.");



//        Thread thread = Thread.currentThread();
        //查询线程的几个状态
//        System.out.println(thread.getState());
//        System.out.println(thread.getThreadGroup());
//        System.out.println(thread.getPriority());
//        System.out.println(thread.getUncaughtExceptionHandler());
//        thread.interrupt();
//        System.out.println(thread.getState());
//        System.out.println(thread.isAlive());
//        //测试当前线程是否已经中断。线程的 中断状态 由该方法清除。
//        // 换句话说，如果连续两次调用该方法，则第二次调用将返回 false（在第一次调用已清除了其中断状态之后，且第二次调用检验完中断状态前，当前线程再次中断的情况除外）。
//        System.out.println(thread.interrupted());
//        //测试线程是否已经中断。线程的 中断状态 不受该方法的影响。
//        System.out.println(thread.isInterrupted());

        //线程的run()方法是由java虚拟机直接调用的，如果我们没有启动线程（没有调用线程的start()方法）而是在应用代码中直接调用run()方法，
        //那么这个线程的run()方法其实运行在当前线程（即run()方法的调用方所在的线程）之中，而不是运行在其自身的线程中，从而违背了创建线程的初衷
//        TestRunThread testRunThread1 = new TestRunThread();
//        testRunThread1.run();
//        System.out.println("当前运行run方法的线程:"+Thread.currentThread().getName());
//        TestRunThread testRunThread2 = new TestRunThread();
//        testRunThread2.start();




//        ArrayList<Product> list = new ArrayList<>();
//
//        Producer producer = new Producer(list);
//        Consumer consumer = new Consumer(list);
//        for(int i=0;i<=10;i++){
//            new Thread(producer).start();
//            new Thread(consumer).start();
//        }
        //wait()的作用是让当前线程由“运行状态”进入“等待(阻塞)状态”的同时，也会释放同步锁。而sleep()的作用是也是让当前线程由“运行状态”进入到“休眠(阻塞)状态”。
        //wait()会释放对象的同步锁，而sleep()则不会释放锁。
//        ThreadA thread1 = new ThreadA("111");
//        ThreadA thread2 = new ThreadA("222");
//
//        thread1.start();
//        thread2.start();


        Thread t = new Thread(){
            public void run(){
                ping();
            }
        };
        t.run();
        System.out.println("pong");
    }
    static void ping() {
        System.out.println("ping");
    }

//    static class ThreadA extends Thread{
//        public ThreadA(String name) {
//            super(name);
//        }
//
//        public void run(){
//            synchronized(obj){
//                for(int i = 0;i < 10;i++){
//                    System.out.printf("%s: %d\n", this.getName(), i);
//                    if(i%4 == 0){
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                }
//            }
//        }
//    }

}
