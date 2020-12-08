import java.util.Scanner;

public class Warmup {
    int x;
    // TODO: The following app is broken and needs to be debugged. Change the code below to run in the expected manner.
    //  In this exercise, assume the user will always enter a valid data type (an integer, then a string).
    //  When working correctly, the program should have a similar output to the following:
    /*
        Welcome to 'PRINT THE VEGETABLE COUNT' app!

        How many vegetables do you have? 3
        What kind of vegetable? (use a singular noun, e.g. 'carrot' vs. 'carrots'): carrot
        You have 3 carrots!


        Process finished with exit code 0
     */

    // HINT: You can fix the unexpected behavior by altering or adding a single line


    public Warmup() {
        x = 5;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to 'PRINT THE VEGETABLE COUNT' app!\n");
//        System.out.print("How many vegetables do you have? ");
//        int count = sc.nextInt();
//        sc.nextLine();
//        System.out.print("What kind of vegetable? (use a singular noun, e.g. 'carrot' vs. 'carrots'): ");
//        String veggie = sc.nextLine();
//        System.out.printf("You have %d %ss!\n\n", count, veggie);




//        What is the difference between static and instance methods/variables?
//        - instance methods/variables can have different values in different instances
//        - static methods/variables have the same values over all instances
//        What is an instance and what is instantiation?
//        - an instance is a specific realization of any object.
//        - the creation of a realized instance is called instantiation.
//        What is an object in Java?
//        - an object is an instance of a class.
//        What is a class in Java?
//        - a class is a user defined blueprint or prototype from which objects are created
//        What is the difference between a class and an object?
//        - a class is a template for objects
//        - an object is a member or an "instance" of a class.
//        What is a constructor?
//        - a constructor in Java is a special method that is used to initialize objects
//        - the constructor is called when an object of a class is created.

        Warmup myObj = new Warmup();
        System.out.println(myObj.x);


//        What are some additional uses of the ‘final’ keyword?
//        - Define Constants
//        - Prevent inheritance
//        - Prevent overriding
//        - Method Arguments
//        What are some uses of the ‘this’ keyword?
//
//        What are visibility modifiers?
//        Why use private visibility?



    }
}