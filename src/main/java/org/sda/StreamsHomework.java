package org.sda;

import org.w3c.dom.NameList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Using streams for a given lists:
 * ["John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn"]
 * [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
 * a) Sort the list.
 * b) Print only those names, that start with "E" letter.
 * c) Print values greater than 30 and lower than 200.
 * d) Print names uppercase.
 * e) Remove first and last letter, sort and print names.
 * d) Sort backwards by implementing reverse Comparator and using lambda expression.
 *
 * @author Kristel Talimaa
 */

public class StreamsHomework {
    public static void main(String[] args) {

        // Sort the list.
        System.out.println("The list of names sorted alphabetically:");
        List<String> nameList = List.of("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        nameList.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("The list of numbers sorted in ascending order:");
        List<Integer> numberList = List.of(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);
        numberList.stream()
                .sorted()
                .forEach(System.out::println);

        // Print only those names, that start with "E" letter.
        System.out.println("Names that start with 'E':");
        Stream<String> namesWithE = nameList.stream().filter(s -> s.startsWith("E"));
        System.out.println(namesWithE.collect(Collectors.toList()));

        // Print values greater than 30 and lower than 200.
        System.out.println("Values between 30 and 200 from the list:");
        List<Integer> sortedNumbers = numberList.stream()
                .filter(x -> x >= 30)
                .filter(x -> x <= 200)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // Print names uppercase.
        System.out.println("Names to uppercase:");
        List<String> namesToUpperCase = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        nameList.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name + " "));

        // Remove first and last letter, sort and print names.
        System.out.println("Sorting and printing names after removing first and last letter:");
        List<String> removeChar = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        removeChar.stream().map(name -> name.substring(1, name.length() - 1)).sorted().forEach(name -> System.out.println(name + " "));

        // Sort backwards by implementing reverse Comparator and using lambda expression.
        System.out.println("List of names sorted backwards:");
        nameList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println("List of numbers sorted backwards:");
        numberList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // How to use lambda here?
    }
}
