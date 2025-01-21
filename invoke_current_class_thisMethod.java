/* 2.Write java program to invoke current class method using this keyword
*/


package Java_Internship;

class A {
    
   void method1() {
        
       System.out.println("Method1");
        
       // Calling method2 using 'this'
        
       this.method2();
    
   }

    
   void method2() {
        
       System.out.println("Method2");
    
   }

}

public class invoke_current_class_thisMethod 
{
    
    public static void main(String[] args) {
        
        // Creating an object of class A
        
        A obj = new A();
        
        // Invoking method1
        
        obj.method1();
    
    }

}

/*Output


Method1

Method2

*/