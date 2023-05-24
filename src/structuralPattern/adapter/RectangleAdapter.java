package structuralPattern.adapter;

public class RectangleAdapter implements Rectangle{

    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }
    @Override
    public void setWidth(double width) {
        double currentWidth = legacyRectangle.getX2() - legacyRectangle.getX1();
        double diff = width - currentWidth;
        if (diff > 0) {
            legacyRectangle.setLowerRight(legacyRectangle.getX2() + diff, legacyRectangle.getY2());
        }
        else {
            legacyRectangle.setLowerRight(legacyRectangle.getX2() - Math.abs(diff), legacyRectangle.getY2());
        }
    }

    @Override
    public void setHeight(double height) {
        double currentHeight = legacyRectangle.getY2() - legacyRectangle.getY1();
        double diff = height - currentHeight;
        if (diff > 0) {
            legacyRectangle.setLowerRight(legacyRectangle.getX2(), legacyRectangle.getY2() + diff);
        } else {
            legacyRectangle.setLowerRight(legacyRectangle.getX2(), legacyRectangle.getY2() - Math.abs(diff));
        }
    }

    @Override
    public double getArea() {
        return legacyRectangle.calculateArea();

    }

    @Override
    public void getPerimeter() {

    }

    public static void main(String[] args) {
        // Create a LegacyRectangle object
        LegacyRectangle legacyRectangle = new LegacyRectangle(10, 20, 30, 40);

        // Create a RectangleAdapter object
        RectangleAdapter adapter = new RectangleAdapter(legacyRectangle);

        // Use the adapter as a Rectangle in the new system
        adapter.setWidth(50);
        adapter.setHeight(60);
        double area = adapter.getArea();

        System.out.println("Area: " + area);
    }
}
