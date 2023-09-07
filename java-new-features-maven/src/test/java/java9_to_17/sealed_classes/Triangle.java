package java9_to_17.sealed_classes;

public non-sealed class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}
