package pizza.factory;

import pizza.product.*;
import pizza.product.american.*;

public final class AmericanIngredientFactory implements IngredientFactory {
    public Dough  createDough()  { return new ThickCrustDough(); }
    public Sauce  createSauce()  { return new BarbecueSauce(); }
    public Cheese createCheese() { return new Cheddar(); }
}