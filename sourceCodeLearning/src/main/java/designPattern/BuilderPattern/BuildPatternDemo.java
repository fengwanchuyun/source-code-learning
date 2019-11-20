package designPattern.BuilderPattern;

public class BuildPatternDemo {
    public static void main(String[] args) {
        System.out.println("点餐开始...");

        //
        MealBuilder builder = new MealBuilder();
        //套餐1
        Meal meal1 = builder.pickMealByType(1);
        meal1.showItems();
        System.out.println("套餐1共计消费："+meal1.getCost());
        //套餐2
        Meal meal2 = builder.pickMealByType(2);
        meal2.showItems();
        System.out.println("套餐2共计消费："+meal2.getCost());
        //套餐3
        Meal meal3 = builder.pickMealByType(3);
        meal1.showItems();
        System.out.println("套餐3共计消费："+meal3.getCost());
        //套餐4
        Meal meal4 = builder.pickMealByType(4);
        meal4.showItems();
        System.out.println("套餐4共计消费："+meal4.getCost());

    }
}
