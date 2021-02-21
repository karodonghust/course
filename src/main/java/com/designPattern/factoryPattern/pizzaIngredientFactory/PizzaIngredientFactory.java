package com.designPattern.factoryPattern.pizzaIngredientFactory;

import com.designPattern.factoryPattern.pizzaIngredient.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
