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
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_5_should_be_V() {
        // Arrange
        int input = 5;
        String expectedResult ="V";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_10_should_be_X() {
        // Arrange
        int input = 10;
        String expectedResult ="X";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_50_should_be_L() {
        // Arrange
        int input = 50;
        String expectedResult ="L";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_100_500_1000_should_be_C_D_M() {
        // Arrange
        RomanNumber romanNumber = new RomanNumber();

        // Act
        // Assert
        assertEquals("C", romanNumber.covert(100));
        assertEquals("D", romanNumber.covert(500));
        assertEquals("M", romanNumber.covert(1000));
    }

    @Test
    public void romanNumber_of_2_should_be_II() {
        // Arrange
        int input = 2;
        String expectedResult ="II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_3_should_be_III() {
        // Arrange
        int input = 3;
        String expectedResult ="III";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_20_should_be_XX() {
        // Arrange
        int input = 20;
        String expectedResult ="XX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_30_should_be_XXX() {
        // Arrange
        int input = 30;
        String expectedResult ="XXX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_200_should_be_CC() {
        // Arrange
        int input = 200;
        String expectedResult ="CC";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_300_should_be_CCC() {
        // Arrange
        int input = 300;
        String expectedResult ="CCC";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}
