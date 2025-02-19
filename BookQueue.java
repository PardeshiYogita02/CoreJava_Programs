//2.Write a program using ArrayDeque to add book names and add,delete the values from both ends of que.

package Java_Internship;

import java.util.ArrayDeque;

public class BookQueue {
    public static void main(String[] args) {
        ArrayDeque<String> books = new ArrayDeque<>(); // Queue to store books
        
        books.addFirst("Harry Potter"); // Add at front
        books.addLast("The Hobbit"); // Add at end
        books.addFirst("Moby Dick");
        books.addLast("War and Peace");
        
        System.out.println("Books: " + books);
        
        books.removeFirst(); // Remove from front
        books.removeLast(); // Remove from end
        
        System.out.println("Updated Books: " + books);
    }
}

/*
OUTPUT
Books: [Moby Dick, Harry Potter, The Hobbit, War and Peace]
Updated Books: [Harry Potter, The Hobbit]
*/