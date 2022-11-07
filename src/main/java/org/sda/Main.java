package org.sda;

import org.sda.generics.*;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {

    @SuppressWarnings("unchecked")
    // suppressWarnings - java will not look for warnings when compiling the code // always give parameter inside

    public static void main(String[] args) {

        // GENERIC TYPE
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("green");
        fruit.setPrice(BigDecimal.valueOf(1.99));       // converting double to BigDecimal

        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);            // assigning Fruit class to GenericFood class

        System.out.println(genericFoodWithFruit.getItem());     // there has to be toString in Fruit also

        String str = "I'm a great developer!";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I'm a good person!");
        System.out.println(genericFoodWithString.getItem());

        // GENERIC TYPE - EXTENDS
        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());

        // GENERIC TYPE - INTERFACE
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(3);
        System.out.println("Snack 1 is better than snack 2: " + snack1.isBetter(snack2));

        // LIST
        List<String> animalList = new ArrayList<>();
        animalList.add("Lion");     // 0
        animalList.add("Tiger");    // 1
        animalList.add("Dog");      // 2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Panda");

        System.out.println(animalList.get(1));      // prints tiger

        animalList.remove(1);       // removing item from the list, if nr 1, tiger will be deleted
        animalList.remove("Dog");

        for (String animal : animalList) {
            System.out.println(animal);
        }

        Iterator<String> stringIterator = animalList.listIterator();       // is similar to scanner.hasNext()

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + " ");
        }

        // List of items to be removed
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);

        // Final removed list
        for (String animal : animalList) {
            System.out.println(animal);
        }

        // SET
        Set<String> countrySet = new HashSet<>();       // same like list // hashset is non-sorted, randomly sorted
        countrySet.add("Eesti");
        countrySet.add("Saksamaa");
        countrySet.add("Poola");
        countrySet.add("Rootsi");
        // countrySet.add("Eesti"); -> duplicates not allowed

        // to get set value, use e.g. for loop
        for (String country : countrySet) {
            System.out.println(country);
        }

        System.out.println("Before sorting: " + countrySet);
        TreeSet<String> countryTreeSet = new TreeSet<>(countrySet);       // Stored as sorted      // converting hasSet to treeSet
        System.out.println("After sorting: " + countryTreeSet);


        // MAP exercise
        Map<String, String> fullName = new HashMap<>();             // one string for name, another surname      // hashMap is also not sorted
        fullName.put("Kristel", "Talimaa");                      // same what .add, but in map used .put        // left one is key, right one is value
        fullName.put("Martin", "Põlluste");
        fullName.put("Cat", "Purr");
        fullName.put("Vinod", "John");
        //fullName.put("Marko", "Ennuste"); -> not possible as one key assign to one value. Duplicate key not allowed
        System.out.println(fullName);

        System.out.println(fullName.get("Kristel"));        // if you give the key as Kristel, prints value as Talimaa
        System.out.println(fullName.remove("Vinod"));      // removes the value from the map
        System.out.println(fullName);

        // Map
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Kristel", 26);
        ageMap.put("Martin", 27);

        // Map of list
        Map<String, List<String>> friendsMap = new HashMap<>();
        List<String> kristelFriendList = List.of("Kadri-Ann", "Jana", "Kadi");
        List<String> martinFriendList = List.of("Tõnis", "Aleks", "Andre");
        friendsMap.put("Kristel", kristelFriendList);
        friendsMap.put("Martin", martinFriendList);

        // Map of maps
        Map<String, Map<String, String>> detailsMap = new HashMap<>();
        Map<String, String> kristelInfoMap = new HashMap<>();
        kristelInfoMap.put("age", "26");
        kristelInfoMap.put("birthplace", "Pärnu");
        kristelInfoMap.put("residence", "Estonia");
        kristelInfoMap.put("phone", "12345678");
        detailsMap.put("Kristel", kristelInfoMap);

        /*

        Map<String, List<String>> friendsMap = new HashMap<>();
        List<String> kristelFriendList = List.of("Kadri-Ann", "Jana", "Kadi");
        List<String> martinFriendList = List.of("Tõnis", "Aleks", "Andre");
        friendsMap.put("Kristel", Arrays.asList("Kadri-Ann", "Jana"));
        friendsMap.put("Martin", Arrays.asList("Aleks", "Tõnis"));
        System.out.println(friendsMap);

        Map<String, Map<String, String>> detailsMap = new HashMap<>();
        Map<String, String> detailsItself = new HashMap<String, String>();

        detailsItself.put("Name", "Kristel");
        detailsItself.put("ID", "123456789");
        detailsItself.put("Birth place", "Pärnu");

        detailsMap.put("1", detailsItself);
        System.out.println("Details: " + detailsItself);

         */


        // INPUT & OUTPUT
        File absoluteFile = new File("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\myText.txt");
        File relativeFile = new File("myText.txt");

        // File reading
        try {
            FileReader fileReader = new FileReader(absoluteFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine;        // to store the line of text from the file

            while ((fileLine = bufferedReader.readLine()) != null) {     // reads all the lines in this file
                System.out.println(fileLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // File writing
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(absoluteFile, true));
            String fileLine = "\nI can write an error-less Java code. :D";
            bufferedWriter.write(fileLine);
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Serialization - Writing an object to a file
        String fileName = "file.ser";

        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);

            outputStream.writeObject(fruit);
            outputStream.close();       // closing the file
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // Deserialization - To get/read an object from a file

        Fruit deserializedFruit = null;

        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream inputStream = new ObjectInputStream(file);

            deserializedFruit = (Fruit) inputStream.readObject();

            inputStream.close();
            file.close();

            System.out.println(deserializedFruit.toString());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // NEW I/O

        Path absolutePath = Paths.get("C:\\Users\\ktali\\java-advanced\\src\\main\\resources\\myText.txt");
        Path relativePath = Paths.get("myText.txt");

        try {
            // File reading
            List<String> fileLines = Files.readAllLines(absolutePath, StandardCharsets.UTF_8);     // every line represents different string, which is stored into variable fileLines

            // Just to print a file which was read above
            for(String fileLine: fileLines) {
                System.out.println(fileLine);
            }

            // File writing
            List<String> fileLinesToWrite = List.of("I love Java", "Estonia is my country!");
            Files.write(absolutePath, fileLinesToWrite, StandardOpenOption.APPEND);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}