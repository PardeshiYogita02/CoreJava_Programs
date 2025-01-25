/* Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20] */

package Java_Internship;

import java.util.Arrays;

public class Ascending_order {
    public static void main(String[] args) {
        int[] arr = {45, 35, 56, 67, 78, 89, 78, 12, 20};
        
        
        Arrays.sort(arr);     // Sorting the array in ascending order

        
        System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(arr));  // Display the sorted array
    }
}

/* OUTPUT

Sorted Array in Ascending Order: [12, 20, 35, 45, 56, 67, 78, 78, 89]
*/