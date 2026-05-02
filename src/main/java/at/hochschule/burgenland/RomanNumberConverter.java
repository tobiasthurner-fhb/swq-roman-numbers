package at.hochschule.burgenland;

public class RomanNumberConverter {
    public static String toRomanNumbers(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("Number must be between 1 and 3000");
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                result.append(romanNumbers[i]);
                number -= values[i];
            }
        }

        return result.toString();
    }
}
