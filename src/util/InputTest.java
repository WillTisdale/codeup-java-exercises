package util;

public class InputTest {

    public static void main(String[] args){

        Input input1 = new Input();
        System.out.println("Enter a sentence");
        System.out.println(input1.getString());
        System.out.println("Enter yes or no.");
        System.out.println(input1.yesNo());
        input1.getInt(1, 10);
        input1.getDouble(20, 30);

    }
}
