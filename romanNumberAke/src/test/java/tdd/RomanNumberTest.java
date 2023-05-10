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
    public void romanNumber_of_4_should_be_IV() {
        // Arrange
        int input = 4;
        String expectedResult ="IV";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_4_should_be_VI() {
        // Arrange
        int input = 6;
        String expectedResult ="VI";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void romanNumber_of_4_should_be_IX() {
        // Arrange
        int input = 9;
        String expectedResult ="IX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}
