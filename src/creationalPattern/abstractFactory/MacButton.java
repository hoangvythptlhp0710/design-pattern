package creationalPattern.abstractFactory;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("This is MacOS button");
    }
}
