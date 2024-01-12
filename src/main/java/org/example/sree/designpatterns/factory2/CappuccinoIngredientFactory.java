package org.example.sree.designpatterns.factory2;

public class CappuccinoIngredientFactory implements IngredientFactory{
    @Override
    public Bean getbean() {
        return new AmericanBean();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }

    @Override
    public Milk getMilk() {
        return new PowderMilk();
    }
}
