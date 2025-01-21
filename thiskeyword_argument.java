/*1.Write a Java Program  to pass  this keyword as argument in the constructor call.*/


package Java_Internship;

class A {
    
  A()   {
        
        // Passing 'this' to another method in the constructor
        
        new B(this);
    
  }

    
  void display() {
        
       System.out.println("Method of Class A ");
   
  }

}


class B {
    
  B(A a) {
       
        // Calling the method of Class A
        
        a.display();
    
        }

}

public class thiskeyword_argument
{
	
        public static void main(String[] args) {
	 
        // Creating object of Class A
        
             new A();
    
        }

}

/*Output

Method of class A 

*/