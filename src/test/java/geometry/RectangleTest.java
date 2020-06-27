package geometry;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    static Rectangle rectangle;

    @BeforeAll
    static void setUp() {
        rectangle = new Rectangle(3,5 );
    }

    @Test
    public void testGetArea() {
        assertEquals(15,rectangle.getArea(),1);
    }
}