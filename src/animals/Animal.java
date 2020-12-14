package animals;

public class Animal {

    private int numberOfLegs;
    private String preferredClimate;

    public void getAnimalInfo(){
        System.out.println(getNumberOfLegs());
        System.out.println(getPreferredClimate());
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate(){
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate){
        this.preferredClimate = preferredClimate;
    }

    public Animal(){

    }

    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }
}
