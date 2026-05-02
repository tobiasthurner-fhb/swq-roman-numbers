package at.hochschule.burgenland;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testSingleDigits(){
        assertEquals("I", RomanNumberConverter.toRomanNumbers(1));
    }

    @Test
    void testIdenticalDigits(){
        assertEquals("II", RomanNumberConverter.toRomanNumbers(2));
    }

    @Test
    void testBasicAddition(){
        assertEquals("XI", RomanNumberConverter.toRomanNumbers(11));
    }

    @Test
    void testBasicSubtraction(){
        assertEquals("VL", RomanNumberConverter.toRomanNumbers(45));
    }

    @Test
    void testMultipleAddition(){
        assertEquals("LXIII", RomanNumberConverter.toRomanNumbers(63));
    }

    @Test
    void testMultipleSubstraction(){
        assertEquals("XLVIII", RomanNumberConverter.toRomanNumbers(48));
    }
}