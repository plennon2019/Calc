package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

//new code
public class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void init()
    {
        calc = new Calculator();
    }

    @DisplayName("subtract pass test")
    @Test
    void testSubtract()
    {
        assertEquals(-7, calc.subtract(10, 17));
    }

    @DisplayName("subtract fail test")
    @Test
    void testSubtractFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->calc.subtract(-1,17));
        assertEquals("Invalid input", e.getMessage());
        //Exception e1 = assertThrows(IllegalArgumentException.class, ()->calc.subtract(1007,17));
    }

    @DisplayName("subtract fail test for over 1000")
    @Test
    void testSubtractFail2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->calc.subtract(1021,17));
        assertEquals("Invalid input", e.getMessage());
        //Exception e1 = assertThrows(IllegalArgumentException.class, ()->calc.subtract(1007,17));
    }



}

