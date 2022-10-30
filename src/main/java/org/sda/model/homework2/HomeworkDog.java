package org.sda.model.homework2;

public class HomeworkDog extends Animal {

    private int age;

    private String name;

    private boolean isMale;

    // constructor
    public HomeworkDog(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    // getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public HomeworkDog(String yieldVoice, String name) {
        super(yieldVoice, name);
    }

    public HomeworkDog() {

    }

    @Override
    public String toString() {
        return "HomeworkDog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}