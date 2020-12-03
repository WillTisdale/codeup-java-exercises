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

        for (int num = 100; num >= -10; num -=5){
            System.out.println(num);
        }

        for (long d = 2; d < 1000000; d = d * d){
            System.out.println(d);
        }

    }

}
