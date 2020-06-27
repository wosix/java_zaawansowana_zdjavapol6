package calc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    private final static Calculator calculator = new Calculator();

//    @BeforeAll
//    static void setUp(){
//        calculator = new Calculator();
//    }

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testMultiplyNumbers3args() {
        assertEquals(5040, calculator.multiplyNumbers(1,8,1));
    }
    @Test
    public void testMultiplyNumbers2args() {
        assertEquals(5040, calculator.multiplyNumbers(1,8));
    }
    @Test
    public void testMultiplyNumbers1arg(){
        assertEquals(5040,calculator.multiplyNumbers(8));
    }
}