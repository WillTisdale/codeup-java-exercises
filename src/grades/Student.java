package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        int numberOfGrades = grades.size();
        for(int grade:grades){
            total += grade;
        }
        return total/numberOfGrades;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Will");
        student1.addGrade(100);
        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(95);
        student1.addGrade(85);
        System.out.println(student1.getGradeAverage());


    }
}
