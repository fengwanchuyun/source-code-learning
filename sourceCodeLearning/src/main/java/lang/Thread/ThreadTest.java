package lang.Thread;

import java.util.ArrayList;

public class ThreadTest {
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

        ArrayList<Product> list = new ArrayList<>();

        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);
        for(int i=0;i<=10;i++){
            new Thread(producer).start();
            new Thread(consumer).start();
        }

    }



//    class Producer implements Runnable{
//        private List<Product> list;
//        public Producer(List<Product> list) {
//            this.list = list;
//        }
//
//        @Override
//        public void run() {
//            if(list.size() >= 10){
//                synchronized (list){
//                    try {
//                        System.out.println("库存已满，等待消费者消费");
//                        list.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }else {
//                list.add(new Product());
//                System.out.println("生产者生产一个产品");
//                synchronized(list) {
//                    list.notifyAll();
//                }
//            }
//
//        }
//    }

//    class Consumer implements Runnable{
//        private List<Product> list;
//        public Consumer(List<Product> list) {
//            this.list = list;
//
//        }
//        @Override
//        public void run() {
//            if (list.size() == 0){
//                synchronized (list){
//                    try {
//                        System.out.println("产品被全部消费，等待生产者生产！");
//                        list.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }else {
//                System.out.println("消费者消费一个产品");
//                list.remove(0);
//                synchronized (list){
//                    list.notifyAll();
//                }
//            }
//        }
//    }

}
