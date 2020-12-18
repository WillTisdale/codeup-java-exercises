package shapes;

import util.Input;

public class CircleApp {

    public static boolean makeCircle = true;

    public static void circleCreator(Input input) {
        do{
            input.setCirclesMade(input, 1);
            Circle circle = new Circle(input.getDouble("Enter a number."));
            makeCircle = input.yesNo("Do you want to make another circle?");
            if(!makeCircle){
                System.out.println("You made " + input.getCirclesMade() + " circles!");
            }
        }while(makeCircle);
    }



    public static void main(String[] args){
        Input input = new Input();
        circleCreator(input);


    }


}
