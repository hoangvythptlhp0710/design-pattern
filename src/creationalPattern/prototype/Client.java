package creationalPattern.prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedCircle = ShapeCache.getShape("Circle");
        System.out.println("Shape: " + clonedCircle.getClass().getSimpleName());
        clonedCircle.draw();

        Shape clonedSquare = ShapeCache.getShape("Square");
        System.out.println("Shape: " + clonedCircle.getClass().getSimpleName());
        clonedSquare.draw();

        Shape cloneRectangle = ShapeCache.getShape("Rectangle");
        System.out.println("Shape: " + clonedCircle.getClass().getSimpleName());
        cloneRectangle.draw();
    }
}
