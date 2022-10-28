package org.sda.model.homework2;

public class HomeworkDog {

    private String name;

    private String race;

    private int age;

    private boolean isMale;

    public HomeworkDog(String name, String race, int age, boolean isMale) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public HomeworkDog() {

    }

    @Override
    public String toString() {
        return "HomeworkDog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }




    /*

     public Dog(boolean isMale, String race) {
        this("Chester", 5, isMale, race, 65.5f);
    }


     */


}
