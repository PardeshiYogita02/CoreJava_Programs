//3.Write a program using exception handling to handle array index out of bounds.

package Java_Internship;

public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // Array with 5 elements

        try {
            // Trying to access an element beyond the array's length
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Array index out of bounds");
        }
    }
}
/*
OUTPUT
Array index out of bounds
*/