package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    @DisplayName("Test convert number to roman number given input 1 expected result should be I")
    public void convertNumberToRomanNumber_case1() {
        // Arrange
        int input = 1;
        String expectedResult = "I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 2 expected result should be II")
    public void convertNumberToRomanNumber_case2() {
        // Arrange
        int input = 2;
        String expectedResult = "II";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 4 expected result should be IV")
    public void convertNumberToRomanNumber_case3() {
        // Arrange
        int input = 4;
        String expectedResult = "IV";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 5 expected result should be V")
    public void convertNumberToRomanNumber_case4() {
        // Arrange
        int input = 5;
        String expectedResult = "V";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 6 expected result should be VI")
    public void convertNumberToRomanNumber_case5() {
        // Arrange
        int input = 6;
        String expectedResult = "VI";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 10 expected result should be X")
    public void convertNumberToRomanNumber_case6() {
        // Arrange
        int input = 10;
        String expectedResult = "X";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }


    @Test
    @DisplayName("Test convert number to roman number given input 50 expected result should be L")
    public void convertNumberToRomanNumber_case7() {
        // Arrange
        int input = 50;
        String expectedResult = "L";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 100 expected result should be C")
    public void convertNumberToRomanNumber_case8() {
        // Arrange
        int input = 100;
        String expectedResult = "C";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 500 expected result should be D")
    public void convertNumberToRomanNumber_case9() {
        // Arrange
        int input = 500;
        String expectedResult = "D";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test convert number to roman number given input 1000 expected result should be M")
    public void convertNumberToRomanNumber_case10() {
        // Arrange
        int input = 1000;
        String expectedResult = "M";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convertToRomanNumberFormat(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}
