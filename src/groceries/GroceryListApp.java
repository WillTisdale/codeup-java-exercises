package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;


public class GroceryListApp {

    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Grocery> items = new ArrayList<>();
        ArrayList<String> dairy = new ArrayList<>();
        ArrayList<String> bread = new ArrayList<>();
        ArrayList<String> dessert = new ArrayList<>();
        ArrayList<String> frozen = new ArrayList<>();
        ArrayList<String> fruit = new ArrayList<>();
        ArrayList<String> vegetable = new ArrayList<>();
        ArrayList<String> meat = new ArrayList<>();


        boolean yesNo = input.yesNo("Would you like to create a Grocery List?");

        while(yesNo){
            yesNo = input.yesNo("Would you like to enter a new item?");
            if(!yesNo){ break; }
            for(String category:Grocery.categories){
                System.out.printf("- %s - ", category);
            }
            System.out.printf("%n^^^ enter a category from above ^^^%n");
            String userCat = input.getString();
            System.out.println("enter the NAME of the item you want to add");
            String userName = input.getString();
            userName.trim();
            System.out.printf("enter the NUMBER of %s you would like to add%n", userName);
            int userNumber = input.getInt();
            Grocery item = new Grocery(userCat, userName, userNumber);
            item.displayInfo();
            System.out.println();
            boolean addMore = input.yesNo("Would you like to add this to the list?");
            if(addMore){
                items.add(item);
                if(userCat.equals("dairy")){
                    dairy.add(userName);
                } else if(userCat.equals("bread")){
                    bread.add(userName);
                } else if(userCat.equals("dessert")){
                    dessert.add(userName);
                } else if(userCat.equals("frozen")){
                    frozen.add(userName);
                } else if(userCat.equals("fruit")){
                    fruit.add(userName);
                } else if(userCat.equals("vegetable")){
                    vegetable.add(userName);
                } else if(userCat.equals("meat")){
                    meat.add(userName);
                }
            }
        }
        if(items.size() > 0) {
                System.out.println("Here is your grocery list");
                System.out.println("----------------------------------------------------");
                System.out.format("|      Item      |     Amount     |    Category    |%n");
                System.out.println("----------------------------------------------------");
                if (bread.size() > 0) {
                    bread.sort(String::compareTo);
                    for (String b : bread) {
                        for (Grocery i : items) {
                            if (i.getName().equals(b)) {
                                System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                            }
                        }
                    }
                }
                if (dairy.size() > 0) {
                    dairy.sort(String::compareTo);
                    for (String d : dairy) {
                        for (Grocery i : items) {
                            if (i.getName().equals(d)) {
                                System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                            }
                        }
                    }
                }
                if (dessert.size() > 0) {
                    dessert.sort(String::compareTo);
                    for (String d : dessert) {
                        for (Grocery i : items) {
                            if (i.getName().equals(d)) {
                                System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                            }
                        }
                    }
                }
                if (frozen.size() > 0) {
                    frozen.sort(String::compareTo);
                    for (String f : frozen) {
                        for (Grocery i : items) {
                            if (i.getName().equals(f)) {
                                System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                            }
                        }
                    }
                }
                if (fruit.size() > 0) {
                    fruit.sort(String::compareTo);
                    for (String f : fruit) {
                        for (Grocery i : items) {
                            if (i.getName().equals(f)) {
                                System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                            }
                        }
                    }
                }
                if (meat.size() > 0) {
                    meat.sort(String::compareTo);
                    for (String m : meat) {
                        for (Grocery i : items) {
                            if (i.getName().equals(m)) {
                                System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                            }
                        }
                    }
                }
                if (vegetable.size() > 0) {
                    vegetable.sort(String::compareTo);
                    for (String v : vegetable) {
                        for (Grocery i : items) {
                            if (i.getName().equals(v)) {
                                System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                            }
                        }
                    }
                }
        }

        System.out.println();
        System.out.println("Thank you! Have a great day!");






    }
}
