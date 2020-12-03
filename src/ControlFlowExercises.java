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
        System.out.printf("What number would you like to go up to? ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number  |  squared  |  cubed");
        System.out.println("------  |  -------  |  -----");
        for (int i = 1; i <= n; i++){
            int number = i;
            int squared = i*i;
            int cubed = i*i*i;
            if (number <= 9){
                System.out.printf("%d       |", number);
            }
            if (number > 9 && number < 100){
                System.out.printf("%d      |", number);
            }
            if (squared <= 9){
                System.out.printf("  %d        |", squared);
            }
            if (squared > 9 && number < 100){
                System.out.printf("  %d       |", squared);
            }
            if (cubed <= 9) {
                System.out.printf("  %d    %n", cubed);
            }
            if (cubed > 9 && number < 100){
                System.out.printf("  %d   %n", cubed);
            }
        }
    }

}
