import util.Input;

public class ServerNameGenerator {

    public static String[] adjectives = {"other", "new", "good", "high", "old",
            "great", "big", "small", "large", "young"};

    public static String[] nouns = {"time", "person", "year", "way", "day", "thing",
            "man", "world", "life", "eye", "woman"};

    public static Input input = new Input();

    public static String randomElement(String[] array){
        double randNum = Math.floor(Math.random() * array.length);
        int randInt = (int) randNum;
        return array[randInt];
    }

    public static void createName(){
        System.out.println("Here is your server name:");
        String name1 = randomElement(adjectives);
        String name2 = randomElement(nouns);
        String userName = name1 + "-" + name2;
        System.out.println(userName);
        boolean response = input.yesNo("Do you want to get a new name?");
        if(response){
            createName();
        }
    }

    public static void main(String[] args){

        createName();













    }

}
