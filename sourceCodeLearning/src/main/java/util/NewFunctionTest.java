package util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class NewFunctionTest {
    public static void main(String[] args) {
        /**
         * JAVA8 四大函数
         */
        //1 Consumer<T>:  T-入参，无出参
        Map<String, String> map = new HashMap<>();
        map.put("haha","huahua");
        Consumer<Map> consumer = p -> {
            p.put("haha","yangayng");
        };
        consumer.accept(map);
        String haha = map.get("haha");
        System.out.println("Consumer test haha===="+haha);

        //2 Function<R>:  T-入参，R-出参
        Function<Integer,Integer> function = p -> {
            int i = p * 10;
            return i;
        };
        Integer apply = function.apply(8);
        System.out.println("Function test i===="+apply);

        //3 Supplier<T> T：出参类型；没有入参
        //常用于业务“有条件运行”时，符合条件再调用获取结果的应用场景；运行结果须提前定义，但不运行。
        Supplier<String> supplier = () ->{
            return "ohahahaha";
        };
        String supplierGet = supplier.get();
        System.out.println("supplier test supplierGet===="+supplierGet);

        //4 Predicate<T> T：出参类型，Boolean类型
        Predicate<String> predicate = p ->{
            return p.equals("huahua");
        };
        boolean predicateFalse = predicate.test("yangyang");
        boolean predicateTrue = predicate.test("huahua");
        System.out.println("Predicate test predicateFalse===="+predicateFalse);
        System.out.println("Predicate test predicateTrue===="+predicateTrue);


    }
}
