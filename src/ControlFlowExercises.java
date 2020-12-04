import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){

//        int i = 5;
//
//        while(i <= 15){
//            System.out.printf("%d ", i);
//            i++;
//        }

//        int n = 0;
//
//        do{
//            n += 2;
//            System.out.println(n);
//        } while(n > 100);

//        for (int num = 100; num >= -10; num -=5){
//            System.out.println(num);
//        }
//
//        for (long d = 2; d < 1000000; d = d * d){
//            System.out.println(d);
//        }

//        String fizz = "Fizz";
//        String buzz = "Buzz";
//        String fizzBuzz = "FizzBuzz";
//        for(int i = 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println(fizzBuzz);
//                continue;
//            }
//            if(i % 5 == 0){
//                System.out.println(buzz);
//                continue;
//            }
//            if(i % 3 == 0){
//                System.out.println(fizz);
//                continue;
//            }
//            System.out.println(i);
//        }

        Scanner sc = new Scanner(System.in);

//        System.out.printf("What number would you like to go up to? ");
//        int n = sc.nextInt();
//        System.out.println();
//        System.out.println("Here is your table!");
//        System.out.println();
//        System.out.println("number  |  squared  |  cubed");
//        System.out.println("------  |  -------  |  -----");
//        for (int i = 1; i <= n; i++){
//            int number = i;
//            int squared = i*i;
//            int cubed = i*i*i;
//            if (number <= 9){
//                System.out.printf("%d       |", number);
//            }
//            if (number > 9 && number < 100){
//                System.out.printf("%d      |", number);
//            }
//            if (number > 99 && number < 1000){
//                System.out.printf("%d     |", number);
//            }
//            if (squared <= 9){
//                System.out.printf("  %d        |", squared);
//            }
//            if (squared > 9 && squared < 100){
//                System.out.printf("  %d       |", squared);
//            }
//            if (squared > 99 && squared < 1000){
//                System.out.printf("  %d      |", squared);
//            }
//            if (squared > 999 && squared < 10000){
//                System.out.printf("  %d     |", squared);
//            }
//            if (squared > 9999 && squared < 100000){
//                System.out.printf("  %d    |", squared);
//            }
//            System.out.printf("  %d    %n", cubed);
//        }

//        System.out.printf("Enter a numerical grade between 0 and 100: ");
//        int grade = sc.nextInt();
//        String more = "Yes";
//        int count = 0;
//            do {
//                ++count;
//                if (grade > 100 || grade < 0){
//                    --count;
//                    System.out.println("You must enter a number between 0 and 100.");
//                }
//                if (grade <= 100 && grade >= 88) {
//                    if (grade >= 99) {
//                        System.out.printf("%d.) %d is an A+%n", count, grade);
//                    } else if (grade <= 89) {
//                        System.out.printf("%d.) %d is an A-%n", count, grade);
//                    } else {
//                        System.out.printf("%d.) %d is an A%n", count, grade);
//                    }
//                }
//                if (grade <= 87 && grade >= 80) {
//                    if (grade >= 86) {
//                        System.out.printf("%d.) %d is a B+%n", count, grade);
//                    } else if (grade <= 81) {
//                        System.out.printf("%d.) %d is a B-%n", count, grade);
//                    } else {
//                        System.out.printf("%d.) %d is a B%n", count, grade);
//                    }
//                }
//                if (grade <= 79 && grade >= 67) {
//                    if (grade >= 78) {
//                        System.out.printf("%d.) %d is a C+%n", count, grade);
//                    } else if (grade <= 68) {
//                        System.out.printf("%d.) %d is a C-%n", count, grade);
//                    } else {
//                        System.out.printf("%d.) %d is a C%n", count, grade);
//                    }
//                }
//                if (grade <= 66 && grade >= 60) {
//                    if (grade >= 65) {
//                        System.out.printf("%d.) %d is a D+%n", count, grade);
//                    } else if (grade <= 61) {
//                        System.out.printf("%d.) %d is a D-%n", count, grade);
//                    } else {
//                        System.out.printf("%d.) %d is a D%n", count, grade);
//                    }
//                }
//                if (grade <= 59 && grade >= 0) {
//                    System.out.printf("%d.) %d is an F%n", count, grade);
//                }
//                try
//                {
//                    System.out.printf("Enter another grade: ");
//                    grade = sc.nextInt();
//                }
//                catch (InputMismatchException exception)
//                {
//                    System.out.println("Thank you!");
//                    more = "no";
//                }
//            }while(more.equalsIgnoreCase("yes"));






    }

}
