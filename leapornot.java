/* Write a program to check leap year using if else. How to check whether a given year is a leap year or not*/
package Java_Internship;

import java.util.Scanner;

public class leapornot {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input the year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the year is a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else
                {
                    System.out.println(year + " is not a leap year.");
                }
            } else 
            {
                System.out.println(year + " is a leap year.");
            }
        } else 
        {
            System.out.println(year + " is not a leap year.");
        }

        
        sc.close();
    }
}
/*OUTPUT
 
1.Enter a year: 2025
2025 is not a leap year.

2.Enter a year: 2000
2000 is a leap year.



 */
