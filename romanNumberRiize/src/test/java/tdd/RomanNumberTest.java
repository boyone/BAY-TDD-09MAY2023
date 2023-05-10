package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberTest {

    @Test
    public void romanNumber_of1_should_be_I() {
        // Arrange
        int input = 1;
        String expectdResult = "I";
        RomanNumber romanNumber = new RomanNumber();

        // Act
        String actualResult = romanNumber.convert(input);

        // Assert
        assertEquals(expectdResult, actualResult);
    }

}
