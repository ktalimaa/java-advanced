package org.sda;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Create a file with "Lorem Ipsum" paragraph within -
 * it can be done by copy-pasting existing paragraph or generating it dynamically using Java library.
 * Read that file.
 * a) count words.
 * b) * Count special signs (like comma, dot, spaces).
 * c) * Select one word and print it's number of occurences.
 *
 * @author Kristel Talimaa
 */

public class IOHomework {
    public static void main(String[] args) throws IOException {

        // File reading
        Path absolutePath = Paths.get("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\loremIpsum.txt");
        Path relativePath = Paths.get("loremIpsum.txt");

        try {

            List<String> fileLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);

            for (String fileLine : fileLines) {
                System.out.println(fileLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Counting words
        File countWords = new File("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\loremIpsum.txt");

        try (Scanner scanner = new Scanner(new FileInputStream(countWords))) {
            int count = 0;
            while (scanner.hasNext()) {
                scanner.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        }

        // Counting special signs
        int countSigns = 0;
        char character;

        File fileSigns = new File("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\loremIpsum.txt");
        Scanner inputFile = new Scanner(fileSigns);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a character you want to count: ");
        character = keyboard.nextLine().charAt(0);






        // One word occurrence
        String word = "Java";
        int wordOccurrence = 0;
        int totalCount = 0;

        File file = new File("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\loremIpsum.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            totalCount++;
            if (sc.next().equals(word)) {
                wordOccurrence++;
            }
        }
        System.out.println("Word count: " + wordOccurrence);
    }
}

/*

File countSigns = new File("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\loremIpsum.txt");

        Scanner scanner = new Scanner(new FileInputStream(countSigns));

        try {
            scanner = new Scanner(new File(countSigns.toURI()));
        } catch (FileNotFoundException e) {
        }

        while (scanner.hasNext()) {
            String character = scanner.next();
            int comaNumber = 0;
            char star = ',';
            while (comaNumber < character.length()) {

                if (character.charAt(comaNumber) == star) {
                    comaNumber++;
                }
                comaNumber++;
            }
            System.out.println("Number of ', ' in the file is: " + comaNumber);
        }

 */

