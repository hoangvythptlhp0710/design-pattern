package creationalPattern.factory;

public class PizzaFactory {


    public void createPizza(String name) {
        if (name.equals("Margherita")) {
            MargheritaPizza margheritaPizza = new MargheritaPizza();
            margheritaPizza.prepare();
        }
        else if (name.equals("Pepperoni")) {
            PepperoniPizza pepperoniPizza = new PepperoniPizza();
            pepperoniPizza.prepare();
        }
        else if (name.equals("Veggie")) {
            VeggiePizza veggiePizza = new VeggiePizza();
            veggiePizza.prepare();
        }
    }



}
