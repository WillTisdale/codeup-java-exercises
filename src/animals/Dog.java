package animals;

public class Dog extends Animal {

    private String furColor;
    private String furLength;
    private int age;

    public void getAnimalInfo(){
        super.getAnimalInfo();
    }

    public Dog(int numberOfLegs, String preferredClimate){
        super(numberOfLegs, preferredClimate);
    }

    public Dog(int age, String furColor, String furLength){
        this.age = age;
        this.furColor = furColor;
        this.furLength = furLength;
    }
}
