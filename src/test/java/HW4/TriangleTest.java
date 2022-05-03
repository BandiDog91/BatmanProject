package HW4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    @DisplayName("Площадь треугольника не отрицательна")
    void areaTriangleNotNegative() {
        double result = Triangle.areaOfATriangle(4, 5, 6);
        Assertions.assertTrue(result > 0);
    }

    @Test
    @DisplayName("Площадь треугольника является числом")
    void areaTriangleNumber() {
        double result = Triangle.areaOfATriangle(4, 5, 6);
        Assertions.assertInstanceOf(Number.class, result);
    }
}