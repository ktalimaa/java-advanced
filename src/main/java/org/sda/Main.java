package org.sda;

import org.sda.abstractfactory.Car;
import org.sda.abstractfactory.CarFactory;
import org.sda.abstractfactory.FactoryProvider;
import org.sda.adapter.Pupil;
import org.sda.adapter.PupilAdapter;
import org.sda.adapter.Student;
import org.sda.adapter.exercise.*;
import org.sda.builders.Weapon;
import org.sda.builders.WeaponBuilder;
import org.sda.builders.exercise.Employee;
import org.sda.builders.exercise.EmployeeBuilder;
import org.sda.builders.exercise.User;
import org.sda.builders.exercise.UserBuilder;
import org.sda.factory.Game;
import org.sda.factory.GameFactory;
import org.sda.factory.HaloGameCreator;
import org.sda.factory.ScrabbleGameCreator;
import org.sda.singleton.Database;
import org.sda.singleton.exercises.Computer;
import org.sda.singleton.exercises.Engine;

import java.util.ArrayList;
import java.util.Arrays;
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


        // ABSTRACT FACTORY
        String typeAbstractFactory = "Lexus";
        CarFactory factoryAbstract = new FactoryProvider().createFactory(typeAbstractFactory);
        Car sedan = factoryAbstract.createSedan();      // returns lexus sedan object, could be combi too

        System.out.println(sedan);


        // USER EXERCISE
        User user = new UserBuilder()
                .withFirstName("Kristel")
                .withLastName("Talimaa")
                .withAge(26)
                .withEmail("kristeltalimaa@gmail.com")
                .withPhoneNumber("+372 555 5555")
                .withAddress("Pärnu")
                .build();

        System.out.println("Users full name is: " + user.getFirstName() + " " + user.getLastName() + ". User is " + user.getAge() + " years old and lives in " + user.getAddress() + ".");

        User user2 = new User("Martin", "Põlluste", 27, "martinpolluste@gmail.com", "+372 555 5555", "Pärnu");
        System.out.println(user2);


        // ADAPTER
        Student ken = new PupilAdapter(new Pupil("Ken", "Derrick", "ken@gmail.com", 20, Arrays.asList(2, 4, 5)));       // new instance
        System.out.println(ken.getFullName());
        System.out.println(ken.isAdult());

        // VIDEO GAME EXERCISE
        Game uncharted = new GameAdapter(new VideoGameExercise("Uncharted 4", 18, 8, 45));
        System.out.println(uncharted.getName());
        System.out.println(uncharted.canBePlayedRemotely());
        System.out.println(uncharted.getValue());

        // RECTANGLE EXERCISE
        Rectangle shape = new SquareAdapter(new Square(4));
        System.out.println(shape.getWidth());
        System.out.println(shape.getArea());

    }


}


    /*

    My version:

    GameObject cod = new GameAdapter(new VideoGameExercise("Call of Duty", 18, 8, 45));
        System.out.println(cod.getAllInformation());
        System.out.println(cod.canBePlayedRemotely());

 */