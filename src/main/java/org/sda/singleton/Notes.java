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





     */


}
