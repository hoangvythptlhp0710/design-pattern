package creationalPattern.builder;

public class PizzaBuilder {

    private String name;
    private String type;
    private int size;
    private String toppings;

    public PizzaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public PizzaBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza build() {
        return new Pizza(name, type, size, toppings);
    }
}
