package at.hochschule.burgenland;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "4, IV",
            "9, IX",
            "11, XI",
            "45, XLV",
            "48, XLVIII",
            "63, LXIII",
            "399, CCCXCIX",
            "944, CMXLIV",
            "3000, MMM"
    })
    void toRomanNumbersConvertsDecimalNumbers(int number, String expectedRomanNumber) {
        assertEquals(expectedRomanNumber, RomanNumberConverter.toRomanNumbers(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 3001})
    void toRomanNumbersRejectsNumbersOutsideSupportedRange(int number) {
        assertThrows(IllegalArgumentException.class, () -> RomanNumberConverter.toRomanNumbers(number));
    }
}