/*Write java program to check  candidate eligible for voting or not
 */

package Java_Internship;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input the age of the candidate
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check if the candidate is eligible for voting
        if (age >= 18)
        {
            System.out.println("You are eligible to vote.");
        } else
        {
            System.out.println("You are not eligible to vote.");
        }

        // Close the scanner
        sc.close();
    }
}

/*
1.Enter your age: 22
You are eligible to vote.
2.Enter your age: 3
You are not eligible to vote.

*/
 