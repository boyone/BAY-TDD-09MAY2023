package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumberTest {

    @Test
    public void romanNumber_of_1_should_be_I() {
        // Arrange
        int input = 1;
        String expectedResult = "I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void romanNumber_of_2_should_be_II() {
        // Arrange
        int input = 2;
        String expectedResult = "II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }


    @Test
    public void romanNumber_of_3_should_be_III() {
        // Arrange
        int input = 3;
        String expectedResult = "III";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(actualResult, expectedResult);
    }
}
