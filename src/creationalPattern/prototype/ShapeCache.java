package creationalPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeType) {
        Shape cachedShape = shapeMap.get(shapeType);
        return cachedShape != null ? cachedShape.clone() : null;
    }

    public static void loadCache() {
        Circle circle = new Circle();
        shapeMap.put("Circle", circle);
        Rectangle rectangle = new Rectangle();
        shapeMap.put("Rectangle", rectangle);
        Square square = new Square();
        shapeMap.put("Square", square);
    }
}
