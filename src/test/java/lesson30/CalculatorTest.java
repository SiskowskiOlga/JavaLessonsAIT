package lesson30;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    private Calculator calculator;


    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("сложение двух позитивных чисел не равно null")
    public void checkAddTwoPositiveNumbersNotNull() {
        assertNotNull(calculator.add(20, 5));
    }

    @Test
    public void checkAddTwoPositiveNumbersPositive() {
        Calculator calculator = new Calculator();
        assertEquals(25, calculator.add(20, 5));
    }

    @Test
    public void checkAddTwoNegativeNumbersPositive() {
        Calculator calculator = new Calculator();
        assertEquals(-70, calculator.add(-20, -50));
    }

    @Test
    public void checkAddTwoZeroNumbersPositive() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.add(-0, 0));

    }
}
