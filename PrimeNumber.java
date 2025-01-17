/*
 Write a program to check given number is prime number or not    
 */
package Java_Internship;

import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);     // Create a Scanner object for user input

        
        System.out.print("Enter a number: ");   // User input
        int number = sc.nextInt();

        
        if (isPrime(number))     // Check if the number is prime
        {
            System.out.println(number + " is a Prime Number");
        } else
        {
            System.out.println(number + " is not a Prime Number");
        }

        
        sc.close();    // Close the scanner
    }

    
    public static boolean isPrime(int num)   //  check if a number is prime
    {
       
        if (num < 2)    // Numbers less than 2 are not prime
        {
            return false;
        }

        // Check for divisors from 2 to num - 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }

        return true; // If no divisors, it's prime
    }
}

/*
1. Enter a number: 1
1 is not a Prime Number

2.Enter a number: 7
7 is a Prime Number

 */


