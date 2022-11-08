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
        Scanner input = new Scanner(new File("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\loremIpsum.txt"));

        while (input.hasNextLine()) {
            String answer = input.nextLine();
            char specialSign = ',';     // can count dot and spaces also
            int count = 0;

            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == specialSign) {
                    count++;
                }
            }
            System.out.println("The sum of ', ' is: " + count);
        }

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





