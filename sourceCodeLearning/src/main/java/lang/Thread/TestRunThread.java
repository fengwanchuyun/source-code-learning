package lang.Thread;

public class TestRunThread extends Thread {

    public void run(){
        System.out.println("当前运行run方法的线程:"+Thread.currentThread().getName());
    }
}
