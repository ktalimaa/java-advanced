package org.sda.singleton;

import java.util.ArrayList;
import java.util.List;

// Lazy Singleton - an instance created during the first attempt at dereferencing
// This type of singleton is created when it is first called, afterwards
// the same type of singleton is used for the rest of the application lifetime
public class Database {

    private static Database instance;
    private List<Integer> numbers = new ArrayList<>();      // represents the real connection with database?

    private Database() {        // private constructor is necessary
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    // This is when the definition on laziness of singleton comes in:
    // here we check if the instance is has been created.
    // If it hasn't then return new instance and pass it into the field.
    public static Database getInstance() {
        // Double checked Lazy Singleton
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) instance = new Database();
            }
        }
        return instance;
    }


}
