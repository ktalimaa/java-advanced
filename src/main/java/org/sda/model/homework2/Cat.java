package org.sda.model.homework2;

public class Cat {

    private String name;

    private int weight;

    private boolean isMale;

    private boolean isFurry;

    public Cat(String name, int weight, boolean isMale, boolean isFurry) {
        this.name = name;
        this.weight = weight;
        this.isMale = isMale;
        this.isFurry = isFurry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isFurry() {
        return isFurry;
    }

    public void setFurry(boolean furry) {
        isFurry = furry;
    }

    public Cat (){

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", isMale=" + isMale +
                ", isFurry=" + isFurry +
                '}';
    }
}
