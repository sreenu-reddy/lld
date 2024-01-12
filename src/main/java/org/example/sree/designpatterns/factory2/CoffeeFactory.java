package org.example.sree.designpatterns.factory2;

public class CoffeeFactory {

    public Coffee serve(CoffeeType coffeeType){
        Coffee coffee;
        switch (coffeeType){
            case ESPRESSO -> coffee= new Espresso(new EspressoIngredientFactory());
            case CAPPUCCINO -> coffee=new Cappuccino(new CappuccinoIngredientFactory());
            default -> coffee =new Robusta(new DefaultIngredientFactory());
        }
        coffee.brew();
        coffee.boil();
        return coffee;
    }
}
