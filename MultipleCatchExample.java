//2.Write a program demonstrating multiple catch statements and finally block.

package Java_Internship;

public class MultipleCatchExample {

    public static void main(String[] args) {
        try {
            
            // Cause NullPointerException (accessing length of null string)
            String str = null;
            System.out.println(str.length());
            
            // Cause ArithmeticException (divide by zero)
            int result = 10 / 0;

        }  catch (NullPointerException e) {
            System.out.println("Null value encountered");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
/*
OUTPUT
Null value encountered
Finally block executed
*/