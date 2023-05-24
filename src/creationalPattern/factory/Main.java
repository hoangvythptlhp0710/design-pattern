package creationalPattern.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Pizza that you want to create: ");
        String name = sc.nextLine();
        PizzaFactory pizzaFactory = new PizzaFactory();
        pizzaFactory.createPizza(name);
    }
}
