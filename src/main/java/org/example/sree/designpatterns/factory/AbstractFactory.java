package org.example.sree.designpatterns.factory;

public interface AbstractFactory {
    Coffee getCoffee(CoffeeType coffeeType);


    /**
     *1. It is not good to use the “new” keyword in our class.Because we can only use a new keyword with concrete class and then it will violate the dependency inversion principle.
     *
     * 2.We  know that our class should only depend on abstraction , Not on concretion.
     *
     * 3. Concretion leads to loss of flexibility in code.
     *
     * 4. One way to solve this problem and get rid of new keywords is to use dependency injection with polymorphic types.
     *
     * 5.it is even better if we inject abstract class or interface instead of some concrete class.
     *
     * 6. We cannot eliminate the use of “new” Keyword because it is necessary to create objects for our code to run. But we can defer the use of the “new” keyword.
     *
     * 7. We always try to defer the use of new keywords to the high level classes or the entry level classes as they contain a lesser amount of code in it.
     *
     * 8. Whenever the type is being mapped with an object then it is known as creational responsibility.
     *
     * 9.This is known as creational  because we are actually creating the objects based on certain parameters.
     *
     *
     *
     * 10. Creational responsibility needs to be implemented in a particular class. Because if we localize this logic in a particular class then that particular class can  be referred to as a  centralized location.
     *
     * 11.A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible for creating the instance of the class.
     *
     * The Factory Method Pattern is also known as Virtual Constructor.
     */

}
