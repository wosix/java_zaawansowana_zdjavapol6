package calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByTwosTest {

    ByTwos byTwos;
    int a;

    @Test
    public void byTwos() {
        a = 0;
    }

    @Test
    public void getNext() {
        assertEquals(2,byTwos.getNext());
    }

    @Test
    public void reset() {
        //assertEquals(0,byTwos.reset());
    }

    @Test
    public void setStart(int x) {
        byTwos.setStart(4);
        assertEquals(4,a);
    }
}