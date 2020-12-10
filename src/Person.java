import java.util.Arrays;

public class Person {

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, " + this.name);
    }

    public Person(String name){
        this.name = name;
    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] morePeople = Arrays.copyOf(people, people.length + 1);
        for (int i = 0; i < morePeople.length; i++){
            if(morePeople[i] == null){
                morePeople[i] = person;
            }
        }
        return morePeople;
    }

    public static void main(String[] args){

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }


}
