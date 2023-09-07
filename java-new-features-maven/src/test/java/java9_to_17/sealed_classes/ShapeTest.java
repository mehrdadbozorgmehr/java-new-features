package java9_to_17.sealed_classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapeTest {

    @Test
    public void testShapeHierarchy() {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0);


        assertTrue(circle instanceof Circle);
        assertTrue(rectangle instanceof Rectangle);
        assertTrue(triangle instanceof Triangle);
        assertTrue(circle instanceof Shape);
        assertTrue(rectangle instanceof Shape);
        assertTrue(triangle instanceof Shape);
    }
}
