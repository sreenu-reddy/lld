package org.example.sree.designpatterns.factory2;

public class Espresso extends Coffee{
    public Espresso( IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void brew() {

    }

    @Override
    void boil() {

    }
}
