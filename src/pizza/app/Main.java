package pizza.app;

import pizza.PizzaType;
import pizza.factory.IngredientFactory;
import pizza.factory.KazakhIngredientFactory;

public class Main {
    public static void main(String[] args) {
        IngredientFactory factory = new KazakhIngredientFactory();
        PizzaApp app = new PizzaApp(factory);

        app.order(PizzaType.Cheese);
    }
}