/**
 * A Java program that reads a list of integers from standard input,
 * stores them in a Stack, sorts them in ascending order, and prints the sorted stack.
 *
 * This program is designed to run directly from the command line.
 *
 */

import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Handles the reading, storing, sorting, and displaying of integers in a Stack.
 */
public class SortedStack {

    /**
     * Reads a list of integers from the user input, sorts them, and prints the sorted stack.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
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

        // Sort numbers in ascending order
        Collections.sort(numbers);
        
        // Push sorted elements into stack
        Stack<Integer> numberStack = new Stack<>();
        for (int num : numbers) {
            numberStack.push(num);
        }

        // Display the stack contents
        System.out.println("Sorted numbers in stack (top to bottom):");
        while (!numberStack.isEmpty()) {
            System.out.println(numberStack.pop());
        }
    }
}
