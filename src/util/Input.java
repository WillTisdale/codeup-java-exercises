package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private static int circlesMade = 0;

    public static void setCirclesMade(Input input, int number){
        input.circlesMade += number;
    }

    public int getCirclesMade(){
        return this.circlesMade;
    }

    public String getString(){
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        if(scanner.next().equalsIgnoreCase("yes")){
            return true;
        }else if(scanner.next().equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        if(scanner.nextLine().equalsIgnoreCase("yes")){
            return true;
        }
        if(scanner.nextLine().equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max){
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            System.out.println("Your input is between the min and max.");
            return userInt;
        } else {
            System.out.println("Your input is NOT between the min and max.");
            return getInt(min, max);
        }
    }

    public int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            System.out.println("Your input is between the min and max.");
            return userInt;
        } else {
            System.out.println("Your input is NOT between the min and max.");
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Enter a number.");
        int userInt = scanner.nextInt();
        return userInt;
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        System.out.println("Enter a number.");
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max){
        double userInt = getInt();
        if (userInt >= min && userInt <= max) {
            System.out.println("Your input is between the min and max.");
            return userInt;
        } else {
            System.out.println("Your input is NOT between the min and max.");
            return getDouble(min, max);
        }
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        double userInt = getInt();
        if (userInt >= min && userInt <= max) {
            System.out.println("Your input is between the min and max.");
            return userInt;
        } else {
            System.out.println("Your input is NOT between the min and max.");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a number with decimals.");
        double userInt = scanner.nextDouble();
        return userInt;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        System.out.println("Enter a number.");
        double userInt = scanner.nextDouble();
        return userInt;
    }



}
