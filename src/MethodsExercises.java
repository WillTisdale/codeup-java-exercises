import java.util.Scanner;

public class MethodsExercises {

    public static void add(int a, int b){
        int c = a + b;
        System.out.printf("%d + %d = %d%n", a, b, c);
    }

    public static void subtract(int a, int b){
        int c = a - b;
        System.out.printf("%d - %d = %d%n", a, b, c);
    }

    public static void multiply(int a, int b){
        int c = 0;
        for(int i = 1; i <= b; i++){
            c += a;
        }
        System.out.printf("%d * %d = %d%n", a, b, c);
    }


    public static int mult(int a, int b){
        if(b <= 1){
            return a;
        } else {
            return a + mult(a, b -1);
        }
    }

    public static void divide(int a, int b){
        if(a == 0 || b == 0){
            int c = 0;
            System.out.printf("%d / %d = %d%n", a, b, c);
        } else if (a < b){
            float d = (float) a;
            float e = (float) b;
            float c = d / e;
            System.out.printf("%.0f / %.0f = %.2f%n", d, e, c);
        } else {
            int c = a / b;
            System.out.printf("%d / %d = %d%n", a, b, c);
        }
    }

    public static void modulus(int a, int b){
        if(a == 0){
            int c = 0;
            System.out.printf("%d %% %d = %d%n", a, b, c);
        } else if (b == 0){
            int c = a;
            System.out.printf("%d %% %d = %d%n", a, b, c);
        } else {
            int c = a % b;
            System.out.printf("%d %% %d = %d%n", a, b, c);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        modulus(a, b);
        System.out.println(mult(a, b));

    }

}
