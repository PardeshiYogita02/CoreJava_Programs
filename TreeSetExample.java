//3.Write a program using TreeSet insert Integer values and print them.

package Java_Internship;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(); // TreeSet for sorted integers
        
        numbers.add(1); // Add values
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(numbers); // Print sorted numbers
    }
}

/*
OUTPUT
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
*/