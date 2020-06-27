package calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    static Addition addition;

    @Test
    public void calculate() {
        assertEquals(4,addition.calculate(2,2));
    }
}