/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study".Create an object of the Student class and call both the "speak" and "study" methods.
*/



package Java_Internship;

class Person // Parent class: Person

{
  
  public void speak(){ // Method to speak
      
      String name="Yogita Pardeshi";
      
      int age=22;
      
      System.out.println("I am "+ name +" and I am "+ age +" years old.");
    

}

}


class Student extends Person // Child class: Student, inheriting from Person

{
   
    public void Study() // Method to study
   
    {
        
         String grade = "A";
        
         System.out.println("My Grade is : " + grade);

}

   
}

public class Inheritance
{
    
    public static void main(String[] args) {
	
    Student obj=new Student();
	
    // Call the speak and study methods
	
    obj.speak();
	
    obj.Study();
	
    } 

}



/* OUTPUT

I am Yogita Pardeshi and I am 22 years old.

My Grade is : A

*/