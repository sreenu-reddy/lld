package org.example.sree.designpatterns.factory;

public class CoffeeFactory implements AbstractFactory{
    @Override
    public Coffee getCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType){
            case ROBUSTA -> coffee=new Robusta();
            case ESPRESSO -> coffee=new Espresso();
            default -> coffee=new Cappuccino();
        }
        coffee.boil();
        coffee.brew();
        return coffee;
    }
}
