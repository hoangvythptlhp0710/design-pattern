package structuralPattern.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LegacyRectangle {
    private double x1, x2, y1, y2;

    public LegacyRectangle(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setUpperLeft(double x, double y) {
        x1 = x;
        y1 = y;
    }

    public void setLowerRight(double x, double y) {
        x2 = x;
        y2 = y;
    }

    public double calculateArea() {
        double width = x2 - x1;
        double height = y2 - y1;
        return width * height;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
