package pizza.product;

public abstract class Pizza {
    private final String name;

    protected Pizza(String name) { this.name = name; }

    public String name() { return name; }

    public void bake() { System.out.println("Baking the pizza..."); }
    public void cut()  { System.out.println("Cutting..."); }
    public void box()  { System.out.println("Boxing..."); }
}