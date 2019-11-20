package lang.Thread;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public Product() {
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);


        while (list != null && !list.isEmpty()){
            list = testNull(list);
            System.out.println("list.size+"+list.size());

        }

    }

    private static List<Integer> testNull(List<Integer> list) {

        List<Integer> list1 = new ArrayList<>();

        if(list.size() > 0){
            list1.add(100);
        }
        return list1;

    }
}
