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
}