import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void getAreaTest() throws Exception {
        Triangle triangle = new Triangle(3, 4);
        assertEquals(6,triangle.getArea());
    }
    @Test
    void constructorTest() throws Exception {

        assertThrows(Exception.class, () -> new Triangle(-3,4));
    }
}