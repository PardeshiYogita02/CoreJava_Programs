/*
 Write a java program to check given number is perfect number or not
 */

package Java_Internship;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        
        if (isPerfectNumber(number))    // Call the method to check if the number is perfect
        {
            System.out.println(number + " is a Perfect Number");
        } else 
        {
            System.out.println(number + " is not a Perfect Number");
        }
        
        
        sc.close();  // Close the scanner
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num1) {
        
        if (num1 < 2)     //  Numbers less than 2 cannot be perfect numbers
        {
            return false;
        }
        
        
        int sumofnumbers = 0;    // Variable to store the sum of numbers
        
        
        for (int i = 1; i <= num1 / 2; i++) // Find all divisors of the number
        {
            if (num1 % i == 0) 
            {
                sumofnumbers += i;     // Add the divisor to the sum
            }
        }
       
        return sumofnumbers == num1;
    }
}

/*
 OUTPUT
1. Enter a number: 6
6 is a Perfect Number

2.Enter a number: 8
8 is not a Perfect Number


 */
 