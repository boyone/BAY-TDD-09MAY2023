package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    @DisplayName("case 1: i == \"I\"")
    public void test_calculatenumber1_shouldReturnI() {
        // Arrange
        int input = 1;
        String expectedResult = "I";
        RomanNumber romanNumber =  new RomanNumber();

        // Act
        String actualResult = romanNumber.convert(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}
