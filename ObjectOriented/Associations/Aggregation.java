package Associations;
import java.util.*;
//Basically allows child class to operate seperate from parent class
class Aggregation {
    public static void main(String[] args) {
        Subject math = new Subject("Math");
        String[] startingCourses = {"English", "Science"};
        Student billy = new Student("Billy", startingCourses);
        billy.addCourse(math.getName());
        System.out.println(billy.getCourses());

    }
}
class Subject {
    private String name;
    public Subject(String name){
    this.name = name;
        }
    public String getName(){
    return name;
    }
}
class Student {
    String name;
    private ArrayList<String> studyAreas = new ArrayList<String>();
    public Student(String name, String[] courses) {
        this.name = name;
        for(String i : courses) {
            this.studyAreas.add(i);
        }
    }
    public void addCourse(String course) {
        this.studyAreas.add(course);
    }
    public ArrayList getCourses() {
        return studyAreas;
    }
    
    } 