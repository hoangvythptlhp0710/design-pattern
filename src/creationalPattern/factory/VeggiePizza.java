package creationalPattern.factory;

public class VeggiePizza implements Pizza{
    private String name;
    private String topping;

    public VeggiePizza() {
        this.name = "Veggie";
        this.topping = "tomato";
    }

    public void prepare() {
        System.out.println("Preparing " + name + " with topping: " + topping);
    }
}
