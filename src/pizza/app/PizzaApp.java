package pizza.app;

import pizza.PizzaType;
import pizza.factory.IngredientFactory;
import pizza.factory.PizzaFactory;
import pizza.product.Pizza;

public final class PizzaApp {
    private final IngredientFactory ingredients;
    private final PizzaFactory pizzas = new PizzaFactory();

    public PizzaApp(IngredientFactory ingredients) {
        this.ingredients = ingredients;
    }

    public void order(PizzaType type) {
        Pizza p = pizzas.create(type);
        System.out.printf("Preparing %s with %s, %s, %s%n",
                p.name(),
                ingredients.createDough().name(),
                ingredients.createSauce().name(),
                ingredients.createCheese().name());
        p.bake(); p.cut(); p.box();
        System.out.println("Ready: " + p.name());
    }
}