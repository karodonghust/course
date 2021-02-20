package com.designPattern.FactoryPattern.pizzaIngredientFactory;

import com.designPattern.FactoryPattern.pizzaIngredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
