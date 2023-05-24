package creationalPattern.abstractFactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("This is Windows Button");
    }
}
