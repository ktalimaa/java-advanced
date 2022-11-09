package org.sda.lambdahomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
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

public class LambdaHomework {
    public static void main(String[] args) throws IOException {

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
        List<Integer> intArray = Arrays.asList(10, 15, 20, 25);
        int sum = intArray.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("The sum of elements is: " + sum);


        // Number of words in the input expression (list containing elements of type String).
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string list to count words: ");
        String inputString = br.readLine();
        inputString = inputString.toLowerCase();
        int count = 0;
        Scanner scanner = new Scanner(inputString);
        while (scanner.hasNext()) {
            scanner.next();
            count++;
        }
        System.out.println("Number of words is: " + count);

        // or another way:
        List<Object> companies = new ArrayList<>();
        companies.add(new Company("Postimees", "media", 578));
        companies.add(new Company("Siris", "outdoor media", 4));
        companies.add(new Company("Delfi mMeedia", "media", 383));
        companies.add(new Company("JCDecaux", "outdoor media", 29));

        int result = companies.size();
        System.out.println("Number of companies is: " + result); // 4

        // List before and after sorting (use the Array class and lambda expressions: String::compareToIgnoreCase as a comparator)
        Product product = new Product("Samsung s20+", 899.99d);
        Product product2 = new Product("Samsung s22+", 999.99d);
        Product product3 = new Product("Samsung Flip 3", 849.00d);

        List<Product> productList = Arrays.asList(product, product2, product3);

        System.out.println("List of products before sorting:");
        System.out.println(productList);

        Comparator<Product> productComparator = new Comparator<Product>() {
            public int compare(Product product, Product product2) {
                return product.getProductName().compareToIgnoreCase(product2.getProductName());
            }
        };

        productList.sort(productComparator);

        System.out.println("List of products after sorting by name:");
        System.out.println(productList);

    }
}
