package geometry;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    private static Triangle triangle;


    @BeforeAll
    static void setUp(){
        triangle = new Triangle(4,5);
    }

    @Test
    public void testGetArea(){
        assertEquals(20, triangle.getArea(),1);
    }
}