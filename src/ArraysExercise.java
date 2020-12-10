import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args){

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Will");
        people[1] = new Person("Kelly");
        people[2] = new Person("Jameson");

//        for(Person person : people){
//            System.out.println(person.getName());
//        }

        Person person1 = new Person("Joseph");


        for(Person person : Person.addPerson(people, person1)){
            System.out.println(person.getName());
        }


    }

}
