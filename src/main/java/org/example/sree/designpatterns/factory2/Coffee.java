package org.example.sree.designpatterns.factory2;

public abstract class Coffee {
     protected final Milk milk;
     protected final Sugar sugar;
     protected  final Bean bean;

     protected final IngredientFactory ingredientFactory;

    protected Coffee(IngredientFactory ingredientFactory) {
        this.milk = ingredientFactory.getMilk();
        this.sugar = ingredientFactory.getSugar();
        this.bean = ingredientFactory.getbean();
        this.ingredientFactory = ingredientFactory;
    }


    abstract void brew();
    abstract void boil();
}
