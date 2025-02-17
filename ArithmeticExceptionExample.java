//1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

package Java_Internship;

public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // Attempting division by zero
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("Cannot divide by zero");
        }
    }
}

/*
OUTPUT
Cannot divide by zero
*/