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

        int num = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            if (num == scanner.nextInt()) {
                System.out.println("int -> " + num);
            } else if (num == scanner.nextDouble()) {
                System.out.println("int -> " + num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Hey! That's not a value! Try one more time!");
        }
    }
}




  /*

 public static void main(String[] args) {

        int num = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            if (num == scanner.nextInt()) {
                System.out.println("int -> " + num);
            } else if (num == scanner.nextDouble()) {
                System.out.println("int -> " + num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Hey! That's not a value! Try one more time!");
        }
    }

        or

  try

    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (!scanner.hasNextInt()) {
            System.out.println("Output: " + x);
            scanner.next();
        } else {
            scanner.hasNextDouble();
            System.out.println("Output: " + x);
            scanner.next();
        } else{
        scanner.hasNextLine();
        System.out.println("Wrong input!");
        scanner.next();
    }
    }
    } catch(ExceptionNotFound){
        System.out.println("Hey! That's not a value! Try one more time!");
        }


   */


