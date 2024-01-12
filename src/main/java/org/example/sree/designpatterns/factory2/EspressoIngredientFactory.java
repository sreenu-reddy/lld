package org.example.sree.designpatterns.factory2;

public class EspressoIngredientFactory implements IngredientFactory{
    @Override
    public Bean getbean() {
        return new FrenchBean();
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
