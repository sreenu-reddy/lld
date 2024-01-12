package org.example.sree.designpatterns.factory;

public class CoffeeServer {

    private final AbstractFactory factory;

    public CoffeeServer(AbstractFactory factory) {
        this.factory = factory;
    }

    public Coffee serve (CoffeeType coffeeType){
        return this.factory.getCoffee(coffeeType);
    }
}
