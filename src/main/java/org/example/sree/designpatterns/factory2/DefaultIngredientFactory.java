package org.example.sree.designpatterns.factory2;

public class DefaultIngredientFactory implements IngredientFactory{
    @Override
    public Bean getbean() {
        return new AmericanBean();
    }

    @Override
    public Sugar getSugar() {
        return new NormalSugar();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }
}
