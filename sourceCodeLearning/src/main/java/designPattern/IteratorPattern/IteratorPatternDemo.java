package designPattern.IteratorPattern;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepsitory demo = new NameRepsitory();
        for (Iterator iterator = demo.getIterator();iterator.hasNext();) {
            String next = (String) iterator.next();
            System.out.println("next:"+next);
        }
    }
}
