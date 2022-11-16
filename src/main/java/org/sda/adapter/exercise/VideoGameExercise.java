package org.sda.adapter.exercise;

/**
 * Create a class called VideoGame.
 * Add methods:
 * getPegiName() - Name
 * getAgeRating() - int -> age, how old to be, to play this
 * coresNeeded() - int (any nr of cores)
 * pingTime() - int
 *
 * VideoGame -> In order for CanBePlayedRemotely to be valid it must have a ping less than 100ms.
 *
 * Create an adapter to convert a Video Game into a Game object.
 *
 * @author Kristel Talimaa
 */

public class VideoGameExercise {

    private String pegiName;
    private int ageRating;
    private int coresNeeded;
    private int pingTime;

    // constructor
    public VideoGameExercise(String pegiName, int ageRating, int coresNeeded, int pingTime) {
        this.pegiName = pegiName;
        this.ageRating = ageRating;
        this.coresNeeded = coresNeeded;
        this.pingTime = pingTime;
    }

    // getters
    public String getPegiName() {
        return pegiName;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getCoresNeeded() {
        return coresNeeded;
    }

    public int getPingTime() {
        return pingTime;
    }
}
