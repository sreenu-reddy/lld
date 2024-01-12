package org.example.sree.designpatterns.factory2;

public class Tester {

    public static void main(String[] args) {
        Coffee coffee = new CoffeeFactory().serve(CoffeeType.CAPPUCCINO);
    }
}
