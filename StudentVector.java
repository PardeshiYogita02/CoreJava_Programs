//1. Write a program using Vector to store the list of students details and print the details.


package Java_Internship;

import java.util.Vector;

// Class to store student details
class Student {
    String name, rollNumber;
    int age;

    Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return name + " [" + age + ", " + rollNumber + "] ";
    }
}

public class StudentVector {
    public static void main(String[] args) {
        Vector<Student> students = new Vector<>(); // Vector to store students
        students.add(new Student("Rahul", 12, "101"));
        students.add(new Student("Pritee", 2, "102"));
        students.add(new Student("Yogita", 212, "103"));
        
        students.forEach(System.out::println); // Print student details
    }
}

/*
OUTPUT
Rahul [12, 101] 
Pritee [2, 102] 
Yogita [212, 103] 
*/