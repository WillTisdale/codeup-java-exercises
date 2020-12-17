package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Will");
        Student student2 = new Student("Kelly");
        Student student3 = new Student("Jameson");
        Student student4 = new Student("Joseph");
        student1.addGrade(95);
        student1.addGrade(89);
        student1.addGrade(75);
        student2.addGrade(99);
        student2.addGrade(100);
        student2.addGrade(98);
        student3.addGrade(75);
        student3.addGrade(80);
        student3.addGrade(85);
        student4.addGrade(85);
        student4.addGrade(85);
        student4.addGrade(85);
        students.put("WillTisdale", student1);
        students.put("kellyGt", student2);
        students.put("JuhMason", student3);
        students.put("joeyNUMBER2", student4);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        for (String name: students.keySet()) {
            System.out.printf("|%s|  ", name);
        }
        System.out.println();
        boolean yesNo = true;
        do {
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String userSelection = sc.nextLine();
            if (students.containsKey(userSelection)) {
                String name = students.get(userSelection).getName();
                double average = students.get(userSelection).getGradeAverage();
                System.out.println();
                System.out.printf("Name: %s - GitHub Username: %s%n%nCurrent Average: %.1f", name, userSelection, average );
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of %s", userSelection);
            }
            System.out.println();
            System.out.println("Would you like to see another student?");
            yesNo = input.yesNo();
        } while (yesNo);
        System.out.println("Goodbye, and have a wonderful day!");




    }


}
