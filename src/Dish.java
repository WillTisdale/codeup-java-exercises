public class Dish {

    public int costInCents;
    public String restaurant;
    public String nameOfDish;
    public boolean wouldRecommend;
    public void printSummary(){
        float costInDollars = (float) costInCents / 100;
        System.out.println("--------------------");
        System.out.printf("Restaurant: %s%nName: %s%nCost: $%.2f%nRecommended: %b%n", restaurant, nameOfDish, costInDollars, wouldRecommend);
        System.out.println("--------------------");
    }

}
