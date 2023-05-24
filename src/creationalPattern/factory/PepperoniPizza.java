package creationalPattern.factory;

public class PepperoniPizza implements Pizza{

    private String name;
    private String topping;

    public PepperoniPizza() {
        this.name = "Pepperoni";
        this.topping = "chilli";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " with topping: " + topping);
    }
}
