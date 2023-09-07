package java9_to_17.sealed_classes;

public final class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement methods specific to Rectangle
}
