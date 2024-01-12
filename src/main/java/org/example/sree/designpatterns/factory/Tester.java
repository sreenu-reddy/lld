package org.example.sree.designpatterns.factory;

public class Tester {
    public static void main(String[] args) {
        Coffee coffee = new CoffeeServer(new CoffeeFactory()).serve(CoffeeType.CAPPUCCINO);
        System.out.println(coffee);
    }
}
