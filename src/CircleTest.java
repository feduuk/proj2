import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void getAreaTest() throws Exception {
        Circle circle = new Circle(3);
        assertEquals(28.27,circle.getArea(), 0.01);
    }
    @Test
    void constructorTest() throws Exception {

        assertThrows(Exception.class, () -> new Circle(-3));
    }
}