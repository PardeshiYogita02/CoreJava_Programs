/* write a program to find the perimeter of the square */
package Java_Internship;
import java.util.Scanner;

public class PerimeterofSquare {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the side length of the square
        double side;

        // Take input for the side length of the square
        System.out.print("Enter the side length of the square: ");
        side = scanner.nextDouble();

        // Calculate the perimeter of the square
        double perimeter = 4 * side;

        // Display the perimeter
        System.out.println("The perimeter of the square is: " + perimeter);

        // Close the scanner
        scanner.close();
    }
}

/*OUTPUT
Enter the side length of the square: 4.5
The perimeter of the square is: 18.0

*/