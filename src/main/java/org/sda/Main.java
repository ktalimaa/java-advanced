package org.sda;

import java.util.*;


/**
 * Create a set consisting of colors - given from the user.
 * Present the removal of individual elements from the set.
 * Display the collection before and after sorting
 *
 * @author Kristel Talimaa
 */

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Add your colors!");

        List<String> colorList = new ArrayList<>();
        menuOperation(colorList);
    }

    private static void menuOperation(List<String> colorList) {

        int menuOption = getMenu();

        switch (menuOption) {
            case 1:
                addColor(colorList);
                menuOperation(colorList);
                break;
            case 2:
                deleteColor(colorList);
                menuOperation(colorList);
                break;
            case 3:
                displayColor(colorList);
                menuOperation(colorList);
                break;
            case 4:
                break;
            default:
                System.out.println("Incorrect option, choose the correct one!");
                menuOperation(colorList);
        }
    }


    private static int getMenu() {
        System.out.println("--------------");
        System.out.println("     MENU    ");
        System.out.println("--------------");

        List<String> menu = List.of("Add color", "Delete color", "Display colors", "Exit");

        for (int i = 0; i < menu.size(); i++) {      // displays colors
            System.out.println(i + 1 + ". " + menu.get(i));
        }
        System.out.println("Choose an option from above.");

        return SCANNER.nextInt();
    }


    // displays for each menu
    private static void addColor(List<String> colorList) {
        boolean isAdd = true;

        while (isAdd) {
            System.out.println("Enter a color to add to the list: ");
            String addColor = SCANNER.next();

            if (!colorList.contains(addColor)) {
                colorList.add(addColor);
                System.out.println("'" + addColor + "' added to the list. Do you want to add more colors? (true/false)");
            } else {
                System.out.println("The color already exists! Do you want to add another color? (true/false)");
            }
            isAdd = SCANNER.nextBoolean();
        }
    }

    // delete colors
    private static void deleteColor(List<String> colorList) {
        boolean isDelete = true;


        while (isDelete) {
            System.out.println("Enter a color to be deleted from the list: ");
            String deleteColor = SCANNER.next();

            if (colorList.contains(deleteColor)) {
                colorList.remove(deleteColor);
                System.out.println("'" + deleteColor + "' deleted from the list. Do you want to delete more colors? (true/false)");
                System.out.println("COLORS: " + colorList);
            } else {
                System.out.println("The color does not exists! Do you want to delete another color? (true/false)");
            }
            isDelete = SCANNER.nextBoolean();
        }
    }

    // displaying the color
    private static void displayColor(List<String> colorList) {
        int counter = 1;

        System.out.println("COLORS: ");

        for (int i = 0; i < colorList.size(); i++) {
            String thisColor = colorList.get(i);

            System.out.println(counter + ". " + thisColor);
            counter++;
        }
    }
}

    /*

     //SET
        Set<String> countrySet = new HashSet<>(); // Non-sorted, randomly stored
        countrySet.add("Eesti");    // 525632
        countrySet.add("Saksmaa");  // 152635
        countrySet.add("Poola");
        countrySet.add("Rootsi");
        // countrySet.add("Eesti"); -> Duplicates not allowed!

        for (String country: countrySet) {
            System.out.println(country);
        }

        System.out.println("Before sorting: " + countrySet);
        TreeSet<String> countryTreeSet = new TreeSet<>(countrySet); // Stored as Sorted
        System.out.println("After sorting: " + countryTreeSet);

     */