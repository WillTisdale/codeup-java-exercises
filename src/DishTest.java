public class DishTest {


    public static void main(String[] args){
        Dish dish1 = new Dish();
        dish1.restaurant = "Asian Box";
        dish1.costInCents = 750;
        dish1.nameOfDish = "General Tso Chicken";
        dish1.wouldRecommend = true;
        Dish dish2 = new Dish();
        dish2.restaurant = "Lenny's Subs";
        dish2.costInCents = 900;
        dish2.nameOfDish = "Turkey Bacon Avacado Sub";
        dish2.wouldRecommend = true;
        Dish dish3 = new Dish();
        dish3.restaurant = "Wayback Burgers";
        dish3.costInCents = 1000;
        dish3.nameOfDish = "Double Bacon Burger";
        dish3.wouldRecommend = true;
        dish1.printSummary();
        dish2.printSummary();
        dish3.printSummary();
        DishTools.shoutDishName(dish3);
        DishTools.analyzeDishCost(dish1);
        System.out.println(DishTools.flipRecommendation(dish2));

    }

}
