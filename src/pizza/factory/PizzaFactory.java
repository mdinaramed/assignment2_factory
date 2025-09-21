package pizza.factory;

import pizza.PizzaType;
import pizza.product.Pizza;
import pizza.product.pizza.CheesePizza;
import pizza.product.pizza.VeggiePizza;

public final class PizzaFactory {
    public Pizza create(PizzaType type) {
        if (type == PizzaType.Cheese) return new CheesePizza();
        if (type == PizzaType.Veggie) return new VeggiePizza();
        throw new IllegalArgumentException("Unknown pizza type: " + type);
    }
}