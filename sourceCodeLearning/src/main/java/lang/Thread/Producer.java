package lang.Thread;

import java.util.List;

public class Producer implements Runnable{
    private List<Product> list;
    public Producer(List<Product> list) {
        this.list = list;
    }

    @Override
    public void run() {
        if(list.size() >= 10){
            synchronized (list){
                try {
                    System.out.println("库存已满，等待消费者消费");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else {
            list.add(new Product());
            System.out.println("生产者生产一个产品");
            synchronized(list) {
                list.notifyAll();
            }
        }

    }
}
