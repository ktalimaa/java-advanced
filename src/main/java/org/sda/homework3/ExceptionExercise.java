package org.sda.homework3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write an application that will read the input and print back value that user provided,
 * use try-catch statements to parse the input, e.g. I/O:
 * Input: 10
 * Output: int -> 10
 * <p>
 * Input: 10.0
 * Output: double -> 10.0
 * <p>
 * Input: "Hello!"
 * Output: "Hey! That's not a value! Try one more time!"
 *
 * @author Kristel Talimaa
 */
public class ExceptionExercise {

    public static void main(String[] args) {
        try {
            displayNumber();
        } catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private static void displayNumber() {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println("int -> " + i);
        } else if (scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("double -> " + d);
        } else {
            throw new InputMismatchException("Hey! That's not a value. Try once more!");
        }
    }
}


