package creationalPattern.prototype;

public class Rectangle implements Shape{
    @Override
    public Shape clone() {
        System.out.println("Cloning Rectangle");
        return new Rectangle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
