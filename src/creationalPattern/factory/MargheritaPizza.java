package creationalPattern.factory;

public class MargheritaPizza implements Pizza{
    private String name;
    private String topping;

    public MargheritaPizza() {
        this.name = "Margherita";
        this.topping = "potato";
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name + " with topping: " + topping);
    }
}
