import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    @DisplayName("1. roman number of 1 should be I")
    void romanNumber_of_1_should_be_I() {

        // Arrange
        int input = 1;
        String expectedResult = "I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("2. roman number of 2 should be II")
    void romanNumber_of_2_should_be_II() {

        // Arrange
        int input = 2;
        String expectedResult = "II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("3. roman number of 3 should be III")
    void romanNumber_of_3_should_be_III() {

        // Arrange
        int input = 3;
        String expectedResult = "III";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("4.1 roman number of 20 should be XX")
    void romanNumber_of_20_should_be_XX() {

        // Arrange
        int input = 20;
        String expectedResult = "XX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("4.2 roman number of 30 should be XXX")
    void romanNumber_of_30_should_be_XXX() {

        // Arrange
        int input = 30;
        String expectedResult = "XXX";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("4.3 roman number of 10 should be X")
    void romanNumber_of_10_should_be_X() {

        // Arrange
        int input = 10;
        String expectedResult = "X";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("5.1 roman number of 100 should be C")
    void romanNumber_of_100_should_be_C() {

        // Arrange
        int input = 100;
        String expectedResult = "C";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("5.2 roman number of 200 should be CC")
    void romanNumber_of_200_should_be_CC() {

        // Arrange
        int input = 200;
        String expectedResult = "CC";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("5.3 roman number of 300 should be CCC")
    void romanNumber_of_300_should_be_CCC() {

        // Arrange
        int input = 300;
        String expectedResult = "CCC";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.covert(input);

        // Assert
        assertEquals(expectedResult, actualResult);

    }
}
