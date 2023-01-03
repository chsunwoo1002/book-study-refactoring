package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.brian;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory.brian.ingredients.*;

public class CheesePizzaIngredientFactory implements IngredientFactory {

    @Override
    public String getPizzaName() {
        return "Cheese Pizza";
    }

    @Override
    public Dough createDough() {
        return new FlourDough();
    }

    @Override
    public Source createSource() {
        return new TomatoSource();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
