package creationalPattern.prototype;

public class Circle implements Shape{
    @Override
    public Shape clone() {
        System.out.println("Cloning Circle");
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
