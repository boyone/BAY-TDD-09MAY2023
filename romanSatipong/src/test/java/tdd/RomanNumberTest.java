package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    public void romanNumber_should_be_I() {
        // Arrange
        int input=1;
        String expectedResult = "I";
        RomanNumber romanNumber = new RomanNumber();
        // Act
        String actualResult = romanNumber.convert(input);
        // Assert
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void romanNumber_should_be_II() {
        // Arrange
        int input=2;
        String expectedResult = "II";
        RomanNumber romanNumber = new RomanNumber();
        // Act
        String actualResult = romanNumber.convert(input);
        // Assert
        assertEquals(expectedResult,actualResult);
    }

}
