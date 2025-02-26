/**
 * A Java program that reads a list of integers from standard input,
 * stores them in a LinkedList, sorts them in ascending order, and prints the sorted list.
 *
 * This program is designed to run directly from the command line.
 *
 */

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Handles the reading, storing, sorting, and displaying of integers in a LinkedList.
 */
public class SortedLinkedList {

    /**
     * Reads a list of integers from the user input, sorts them, and prints the sorted list.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                }
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }
        scanner.close();

        Collections.sort(numbers);

        System.out.println("Sorted numbers: " + numbers);
    }
}
