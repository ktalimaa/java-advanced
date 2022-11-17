package org.sda.singleton;

public class Notes {

    /*

    Singleton is a design pattern for creating an object that can be constructed at most once,
    during the application's lifetime.

    Types of singleton
    - Eager singleton - The instance for this singleton is created at application startup
    - Lazy singleton - The instance for this singleton is created at the first point an instance is required afterwards, the same instance is used for the remainder of the applications life.

    Eager Singleton implementation:
    - Class-based singleton (Counter class ex)
    - Enum-based implementation (CountEnum class ex)

    NB! Both implementations of the eager singleton are thread-safe

    Lazy singleton implementation:
    - Lazy singleton (not-thread safe)
    - Lazy double-checked singleton (is thread-safe, because it uses it synchronization block before it does its second check)



    Builder
    The builder design pattern is a way of creating objects that's most often used when creating objects that have many fields.

    Implementation of the builder pattern
    - Builder as a static class in the object (typically constructor is private)
    - Builder as a class of its own

    When implementing a builder, we need to add something called configuring methods. These methods look
    and behave like setters, but they return the builder object each time, allowing you to change the operations
    on an instance of the builder object as well as build method, that compiles the values entered into the builder
    object and creates an object if the specified type the builder should work with.


    Adapter
    The adapter pattern is used to adapt a certain object to the target interface.
    It can be thought if as a bridge between two sometimes unrelated, or it could be that they are
    related, but they don't fit what we need them to.
    We can create an adapter class that implements the interface of the target interface while processing
    the  data from the source class (the object we are transforming).


    BEST PRACTICES

    CLEAN CODE is a term that refers to code that is:
    - elegant - simple, straightforward and easy to read.
    - organized -
    - maintained regularly - up to date
    - written such that passes all necessary tests
    - no duplicated code
    - no unused code, i.e. unused classes, unused methods, unused variables

    SOME CONVENTIONS
    - Naming:
    - classes - They should use camelcasing but must start with a capital letter
    - subsequent words in the class name will also start with a capital letter, e.g. Car or CarEngine

    - Methods - They should start with verb, and they should start with small or lower case letter, but still use camelcasing
    - e.g. getWidth(), startEngine() - correct
    - e.g. width(), Width(), GetWidth() - incorrect

    - Variables - They are similar to methods (in the sense that they also start with lower case and use camelcasing),
    - but they don't need to start with a verb.
    - Since variables describe the state of a value, they are typically nouns.
    - e.g. width, height, size, name, firstName, lastName - correct
    - e.g. Width, wiDth - incorrect

    - Method parameters
    - Your methods should only carry out only one unit on an action, i.e. your methods should not do more than one thing,
    - and they should only have a small number of parameters. Ideally, it shouldn't be more than 20 lines.


    PRINCIPLES
    DRY - Don't Repeat Yourself
    KISS - Keep It Simple Stupid
    YAGNI - You Aren't Gonna Need It


    MANIFESTO for software craftsmanship
    Rules to note:
    - You should build software that is not just working, but also well-crafted (it needs to follow principles of clean code).
    - You should not just respond to change, but also build value.
    - We are not just individuals, but a community of professionals.
    - We don't just engage in customer collaboration, but also productive partnership.


    SOLID - is a set of software engineering principles, that every good programmer should know and follow when creating a code.
    S - Single Responsibility Principle
    O - Open Close Principle
    L - Liskov's Substitution Principle
    I - Interface Segregation Principle
    D - Dependency Inversion Principle

    S - Single Responsibility Principle - We don't want one class doing more than one thing, and we
    don't want multiple classes doing the same thing.

    O - Open Close Principle - This is mostly talking about encapsulation. We want to be able to decide what changes
    classes outside of the object can make to our object.

    L - Liskov's Substitution Principle - This says that you should be able to create a substitute the type of the object
    with its derived type.

    I - Interface Segregation Principle - This says, that interface should not contain too many methods,
    instead break the interface into smaller interfaces and group related methods in them.

    D - Dependency Inversion Principle - This is referring to the ability to pass in dependencies, that your class
    or object needs to function from outside the class.

    // D - Dependency Inversion Principle
    // Square square = new Square(4);
    // Rectangle shape = new SquareAdapter(new Square(square)); -> passing the square as a dependency

     */

}
