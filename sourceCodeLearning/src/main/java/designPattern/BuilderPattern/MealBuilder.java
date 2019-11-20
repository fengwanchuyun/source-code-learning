package designPattern.BuilderPattern;

public class MealBuilder {

    public Meal pickMealByType(int type){
        switch (type){
            case 1:
                return prepareVegMeal1();
            case 2:
                return prepareVegMeal2();
            case 3:
                return prepareNonVegMeal1();
            case 4:
                return prepareNonVegMeal2();
            default:
                return new Meal();
        }
    }

    public Meal prepareVegMeal1(){
        Meal meal = new Meal();
        meal.addItem(new ChiBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareVegMeal2(){
        Meal meal = new Meal();
        meal.addItem(new ChiBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal1(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal2(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
