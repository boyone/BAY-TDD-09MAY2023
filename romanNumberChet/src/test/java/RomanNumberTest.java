import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    @DisplayName("1. roman number of 1 should be I")
    void romanNumber_of_1_should_be_I() {

        // Arrange
        int inout = 1;
        String expectedResult = "I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(inout);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("2. roman number of 1 should be II")
    void romanNumber_of_2_should_be_II() {

        // Arrange
        int inout = 2;
        String expectedResult = "II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(inout);

        // Assert
        assertEquals(expectedResult, actualResult);

    }
}
