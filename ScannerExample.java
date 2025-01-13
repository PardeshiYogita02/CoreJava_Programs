/*Write a Java program to take Employee id,name,address & salary from user and display on to screen.*/

package Java_Internship;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);    // Create a Scanner object for input

        // Declare variables to store employee details
        int employeeId;
        String employeeName, employeeAddress;
        double employeeSalary;

        // Take input from the user
        System.out.print("Enter Employee ID: ");
        employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter Employee Address: ");
        employeeAddress = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = scanner.nextDouble();

        // Display the entered details
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Address: " + employeeAddress);
        System.out.println("Salary: " + employeeSalary);

        // Close the scanner
        scanner.close();
    }
}

/* Output

Enter Employee ID: 02
Enter Employee Name: Yogita Pardeshi
Enter Employee Address: 56,Ganesh Society,Renuka Complex,Solapur
Enter Employee Salary: 40000

Employee Details:
ID: 2
Name: Yogita Pardeshi
Address: 56,Ganesh Society,Renuka Complex,Solapur
Salary: 40000.0
*/