import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner userInput = new Scanner(System.in);
        userInput.useDelimiter("\n");

//        System.out.printf("Enter an integer.%n");
//        int userInt = userInput.nextInt();
//        System.out.println(userInt);

//        System.out.printf("Enter three words.%n");
//        String firstWord = userInput.next();
//        String secondWord = userInput.next();
//        String thirdWord = userInput.next();
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

//        System.out.printf("Enter a sentence.%n");
//        String userString = userInput.nextLine();
//        System.out.println(userString);

//        System.out.printf("Enter values of length, width, and height of a Codeup classroom.%n");
//        String userDemensions = userInput.nextLine();
//        System.out.println(userDemensions);
//        String numbers [] = userDemensions.split(" ");
//        float userLength = Float.parseFloat(numbers[1]);
//        float userWidth = Float.parseFloat(numbers[0]);
//        float userHeight = Float.parseFloat(numbers[2]);
//        float area = userWidth * userLength;
//        float perimeter = (userWidth*2) + (userLength*2);
//        float volume = userWidth * userLength * userHeight;
//        System.out.printf("The area of the classroom is: %.2f%n", area);
//        System.out.printf("The perimeter of the classroom is: %.2f%n", perimeter);
//        System.out.printf("The volume of the classroom is: %.2f%n", volume);

        System.out.printf("Enter values of length, width, and height of a Codeup classroom.%n");
        float userLength = userInput.nextFloat();
        float userWidth = userInput.nextFloat();
        float userHeight = userInput.nextFloat();
        float area = userLength * userWidth;
        float perimeter = (userWidth*2) + (userLength*2);
        float volume = userWidth * userLength * userHeight;
        System.out.printf("The area of the classroom is: %.2f%n", area);
        System.out.printf("The perimeter of the classroom is: %.2f%n", perimeter);
        System.out.printf("The volume of the classroom is: %.2f%n", volume);

    }

}
