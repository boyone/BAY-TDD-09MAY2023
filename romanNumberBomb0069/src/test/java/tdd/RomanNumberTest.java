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
}
