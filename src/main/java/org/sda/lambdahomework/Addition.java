package org.sda.lambdahomework;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 * Create and present the usage of lambda expressions:
 * a) Addition, subtraction, multiplication, division.
 * b) The sum of elements (int type) of the list.
 * c) Number of words in the input expression (list containing elements of type String).
 * d) * List before and after sorting (use the Array class and lambda expressions:
 * String::compareToIgnoreCase as a comparator)
 *
 * @author Kristel Talimaa
 */

public class Addition {
    public static void main(String[] args) {

        // Addition, subtraction, multiplication, division.

        UnaryOperator<Integer> toAddition = x -> x + x;
        System.out.println(toAddition.apply(5));

        int d = 4;
        UnaryOperator<Integer> toSubtraction = y -> y - d;
        System.out.println(toSubtraction.apply(10));

        int k = 3;
        UnaryOperator<Integer> toMultiplication = l -> d * k;
        System.out.println(toMultiplication.apply(0));

        int l = 60;
        UnaryOperator<Integer> toDivision = m -> l / k;
        System.out.println(toDivision.apply(0));


        // The sum of elements (int type) of the list.





    }
}
