import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void getAreaTest() throws Exception {
        Square square = new Square(5);
        assertEquals(25,square.getArea());
    }
    @Test
    void constructorTest() throws Exception {

        assertThrows(Exception.class, () -> new Square(-5));
    }
}