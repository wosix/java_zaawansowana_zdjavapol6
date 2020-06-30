package calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByTwosTest {

    ByTwos byTwos;
    int a;

    @BeforeEach
    public void setUp() {
        byTwos = new ByTwos();
    }

    @Test
    public void byTwos() {
        this.a = a;
    }

    @Test
    public void setStart() {
        byTwos.setStart(19);
        assertEquals(19,byTwos.getStart());
    }

    @Test
    public void getNext() {
        byTwos.setStart(6);
        assertEquals(8, byTwos.getNext());
        assertEquals(10, byTwos.getNext());
        assertEquals(12, byTwos.getNext());
    }

    @Test
    public void reset() {
        byTwos.setStart(18);
        byTwos.getNext();
        byTwos.getNext();
        assertEquals(18,byTwos.getStart());
    }
}