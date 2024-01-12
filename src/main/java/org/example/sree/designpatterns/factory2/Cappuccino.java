package org.example.sree.designpatterns.factory2;

public class Cappuccino extends Coffee{
    protected Cappuccino( IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    void brew() {

    }

    @Override
    void boil() {

    }
}
