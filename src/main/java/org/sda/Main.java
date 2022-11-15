package org.sda;

import org.sda.builders.Weapon;
import org.sda.builders.WeaponBuilder;
import org.sda.factory.Game;
import org.sda.factory.GameFactory;
import org.sda.factory.HaloGameCreator;
import org.sda.factory.ScrabbleGameCreator;
import org.sda.singleton.Database;
import org.sda.singleton.exercises.Computer;
import org.sda.singleton.exercises.Engine;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Eager - an instance created at the start of the application
        // Class based eager singleton
        // Counter counter = new Counter.getInstance(); // returning instance of counter // calling the singleton

        // Enum based eager singleton
        // CountEnum counter = CountEnum.INSTANCE;
        // System.out.println(counter.getCount());
        // counter.increment();    // calling
        // counter.increment();
        // System.out.println(counter.getCount());     // count 2

        Database database = Database.getInstance();
        database.addNumber(1);
        database.addNumber(2);
        database.addNumber(3);
        System.out.println(Database.getInstance().getNumbers().size());     // should return 3


        // Exercise: Create an eager singleton class called Engine
        // It should have a boolean filed called engine (turn off engine, turn on engine)

        /*
        Same solution:

        Engine engine = new Engine();
        engine.turnEngineOn();

         */

        Engine engine = Engine.getInstance();       // returning whatever instance has been created
        engine.turnEngineOn();
        System.out.println(engine.getEngineState());

        // Exercise: Create a lazy double checked singleton called Computer
        // It should have a boolean field called startUp;

        // Computer.startUp = true;        // if public in computer class, it is not correct method from here to access this
        Computer computer = Computer.getInstance();
        System.out.println(computer.getComputerState());

        // Weapon
        // StringBuilder stringBuilder = new StringBuilder().append("Hello").append(" world!");
        // System.out.println(stringBuilder);      // returns as one item

        Weapon ak47 = new WeaponBuilder()       // won't be in same order like Weapon class
                .withType("Gun")
                .withName("AK-47")
                .withPerks(new ArrayList<>())
                .withDamage(10)
                .withDurability(10000)
                .build();

        System.out.println(ak47.getDamage());


        // FACTORY EXAMPLE
        String type = "Board";      // checking the game, could be "PC" too

        GameFactory factory;
        if (type.equals("PC")) {
            factory = new HaloGameCreator();
        } else if (type.equals("Board")) {
            factory = new ScrabbleGameCreator();
        } else {
            throw new RuntimeException("Unknown game type.");
        }

        Game game = factory.create();
        System.out.println(game);



    }
}