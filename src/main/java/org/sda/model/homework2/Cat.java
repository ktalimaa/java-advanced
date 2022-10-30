package org.sda.model.homework2;

public class Cat extends Animal {

    private int weight;

    private String name;

    private boolean isMale;

    public Cat(int weight, String name, boolean isMale) {
        this.weight = weight;
        this.name = name;
        this.isMale = isMale;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Cat(String yieldVoice, String name) {
        super(yieldVoice, name);
    }

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
