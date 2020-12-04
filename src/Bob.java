import java.util.Scanner;

public class Bob {

    public static void main(String[] args){

        String question = "Sure";
        String yell = "Woah, chill out!";
        String empty = "Fine. Be that way!";
        String other = "Whatever.";

        Scanner sc = new Scanner(System.in);
        System.out.printf("Have a conversation with Bob%n");
        int count = 0;
        boolean talk = true;
        String yes = "yes";

        do{
            String userInput = sc.nextLine().trim();
            int lgt = userInput.length();
            count += 1;
            if(count % 5 == 0){
                System.out.println("Do you still want to talk to Bob? [Y,N]");
                String userHuh = sc.nextLine();
                if(userHuh.equalsIgnoreCase("y")){
                    talk = true;
                    sc.nextLine();
                } else {
                    talk = false;
                    break;
                }
            }
            if(userInput.endsWith("?")){
                System.out.println(question);
            } else if(userInput.endsWith("!")){
                System.out.println(yell);
            } else if(lgt < 1){
                System.out.println(empty);
            } else {
                System.out.println(other);
            }
        } while (talk);



    }

}
