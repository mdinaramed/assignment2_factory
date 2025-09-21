package pizza.factory;

import pizza.product.*;
import pizza.product.kazakh.*;

public final class KazakhIngredientFactory implements IngredientFactory {
    public Dough  createDough()  { return new LepeshkaDough(); }
    public Sauce  createSauce()  { return new KymyzSauce(); }
    public Cheese createCheese() { return new KobylyeCheese(); }
}