package org.sda.model;

/**
 * Excercise 1
 *
 * @author Kristel Talimaa
 */


public class Dog {
    private String name;
    private int age;
    private boolean isMale;     // true = male, false = female
    private String race;
    private float weight;

    public Dog(String name, int age, boolean isMale, String race, float weight) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.race = race;
        this.weight = weight;
    }


    public Dog(boolean isMale, String race) {
        this("Chester", 5, isMale, race, 65.5f);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0.5) {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
