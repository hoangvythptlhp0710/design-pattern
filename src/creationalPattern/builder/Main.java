package creationalPattern.builder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String type = sc.nextLine();
        int size = sc.nextInt();
        sc.nextLine();
        String toppings = sc.nextLine();
        Pizza pizza = new PizzaBuilder()
                .setName(name)
                .setType(type)
                .setSize(size)
                .setToppings(toppings).build();
        pizza.displayPizza();
    }

}
