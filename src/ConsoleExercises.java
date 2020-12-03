import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner userInput = new Scanner(System.in);
//        userInput.useDelimiter("\n");

        System.out.printf("Enter an integer.%n");
        int userInt = userInput.nextInt();
        System.out.printf("Your integer is: %d.%n", userInt);

        System.out.printf("Enter three words.%n");
        String firstWord = userInput.next();
        String secondWord = userInput.next();
        String thirdWord = userInput.next();
        System.out.printf("Your three words are: %s, %s, and %s.%n", firstWord, secondWord, thirdWord);

        System.out.printf("Enter a sentence.%n");
        String userString = userInput.nextLine();
        System.out.printf("Your sentence is: '%s'.%n", userString);

        System.out.printf("Enter values of length, width, and height of a Codeup classroom.%n");
        float userLength = Float.parseFloat(userInput.next());
        float userWidth = Float.parseFloat(userInput.next());
        float userHeight = Float.parseFloat(userInput.next());
        float area = userWidth * userLength;
        float perimeter = (userWidth*2) + (userLength*2);
        float volume = userWidth * userLength * userHeight;
        System.out.printf("Length: %.2f.%n", userLength);
        System.out.printf("Width: %.2f.%n", userWidth);
        System.out.printf("Height: %.2f.%n", userHeight);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Volume: %.2f%n", volume);

//        System.out.printf("Enter values of length, width, and height of a Codeup classroom.%n");
//        float userLength = userInput.nextFloat();
//        float userWidth = userInput.nextFloat();
//        float userHeight = userInput.nextFloat();
//        float area = userLength * userWidth;
//        float perimeter = (userWidth*2) + (userLength*2);
//        float volume = userWidth * userLength * userHeight;
//        System.out.printf("The area of the classroom is: %.2f%n", area);
//        System.out.printf("The perimeter of the classroom is: %.2f%n", perimeter);
//        System.out.printf("The volume of the classroom is: %.2f%n", volume);

    }

}
