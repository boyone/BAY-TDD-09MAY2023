package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    public void romanNumber_of_1_should_be_I() {
        // Arrange
        int input = 1;
        String expectedResult ="I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_5_should_be_V() {

        int input = 5;
        String expectedResult ="V";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void romanNumber_of_10_should_be_X() {

        int input = 10;
        String expectedResult ="X";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void romanNumber_of_2_should_be_II() {

        int input = 2;
        String expectedResult ="II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void romanNumber_of_3_should_be_III() {

        int input = 3;
        String expectedResult ="III";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void romanNumber_of_20_should_be_XX() {

        int input = 20;
        String expectedResult ="XX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void romanNumber_of_30_should_be_XXX() {

        int input = 20;
        String expectedResult ="XX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void romanNumber_of_4_should_be_IV() {

        int input = 4;
        String expectedResult ="IV";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void romanNumber_of_9_should_be_IX() {

        int input = 9;
        String expectedResult ="IX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertRoman(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

}
