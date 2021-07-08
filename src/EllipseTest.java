import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {
    @Test
    void getAreaTest() throws Exception {
        Ellipse ellipse = new Ellipse(3, 4);
        assertEquals(37.69,ellipse.getArea(), 0.01);
    }
    @Test
    void constructorTest() throws Exception {

        assertThrows(Exception.class, () -> new Ellipse(-3, 5));
    }
}