package org.sda.adapter.exercise;

import org.sda.factory.Game;

public class GameAdapter implements Game {
    private VideoGameExercise videoGameExercise;

    // constructor
    public GameAdapter (VideoGameExercise videoGameExercise) {
        this.videoGameExercise = videoGameExercise;
    }

    // implementing methods
    @Override
    public String getName() {
        return videoGameExercise.getPegiName();
    }

    @Override
    public String getType() {
        return "PC";
    }

    @Override
    public int getMinNumberOfPlayers() {
        return 1;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return 5;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return videoGameExercise.getPingTime() < 100;
    }



    /*

      @Override
    public String getAllInformation() {
        return videoGameExercise.getPegiName();
    }

    @Override
    public boolean canBePlayedRemotely() {
        return videoGameExercise.getPingTime() <= 100;
    }

     */
}
