package creationalPattern.builder;

public class Pizza {
    private String name;
    private String type;
    private int size;
    private String toppings;

    public Pizza(String name, String type, int size, String toppings) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.toppings = toppings;
    }
    public void displayPizza() {
        System.out.println("Pizza: " + name);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppings);
    }



}
