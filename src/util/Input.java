package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;
    private static int circlesMade = 0;

    public Input(){
         scanner = new Scanner(System.in);
    }

    public static void setCirclesMade(Input input, int number){
        input.circlesMade += number;
    }

    public int getCirclesMade(){
        return this.circlesMade;
    }

    public String getString(){
        return scanner.next();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.next();
    }

    public boolean yesNo(){
        String yesNo = scanner.next();
        if(yesNo.equalsIgnoreCase("yes")){
            return true;
        }
        if(yesNo.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
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
        int userInt = scanner.nextInt();
        return userInt;
    }

    public int getInt(String prompt){
        System.out.println(prompt);
        System.out.println("Enter an integer.");
        int userInt = scanner.nextInt();
        return userInt;
    }

    public double getDouble(double min, double max){
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            System.out.println("Your input is between the min and max.");
            return userDouble;
        } else {
            System.out.println("Your input is NOT between the min and max.");
            return getDouble(min, max);
        }
    }

    public double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            System.out.println("Your input is between the min and max.");
            return userDouble;
        } else {
            System.out.println("Your input is NOT between the min and max.");
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Enter a number with decimals.");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        System.out.println("Enter a number.");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }



}
