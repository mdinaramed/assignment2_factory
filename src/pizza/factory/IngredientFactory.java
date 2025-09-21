package pizza.factory;

import pizza.product.Cheese;
import pizza.product.Dough;
import pizza.product.Sauce;

public interface IngredientFactory {
    Dough  createDough();
    Sauce  createSauce();
    Cheese createCheese();
}