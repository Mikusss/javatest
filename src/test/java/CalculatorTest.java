import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 4);
        assertEquals(8, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.001); // Delta is used for comparing double values
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
