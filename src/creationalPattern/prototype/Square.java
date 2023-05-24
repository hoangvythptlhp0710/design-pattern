package creationalPattern.prototype;

public class Square implements Shape{
    @Override
    public Shape clone() {
        System.out.println("Cloning Square");
        return new Square();
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
