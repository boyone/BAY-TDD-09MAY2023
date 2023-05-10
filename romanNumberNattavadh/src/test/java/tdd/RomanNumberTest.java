package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RomanNumberTest {

  @Test
  @DisplayName("case 1: input 1 should be return \"I\"")
  public void test_number1_shouldReturnI() {
    // Arrange
    int input = 1;
    String expectedResult = "I";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 2: input 5 should be return \"V\"")
  public void test_number5_shouldReturnV() {
    // Arrange
    int input = 5;
    String expectedResult = "V";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 3: input 10 should be return \"X\"")
  public void test_number10_shouldReturnX() {
    // Arrange
    int input = 10;
    String expectedResult = "X";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 4: input 50 should be return \"L\"")
  public void test_number50_shouldReturnL() {
    // Arrange
    int input = 10;
    String expectedResult = "X";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 5: input 100 should be return \"C\"")
  public void test_number100_shouldReturnC() {
    // Arrange
    int input = 100;
    String expectedResult = "C";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 6: input 500 should be return \"D\"")
  public void test_number500_shouldReturnD() {
    // Arrange
    int input = 500;
    String expectedResult = "D";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 7: input 1000 should be return \"M\"")
  public void test_number1000_shouldReturnM() {
    // Arrange
    int input = 1000;
    String expectedResult = "M";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 8: input 2 should be return \"II\"")
  public void test_number2_shouldReturnII() {
    // Arrange
    int input = 2;
    String expectedResult = "II";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 9: input 3 should be return \"III\"")
  public void test_number3_shouldReturnIII() {
    // Arrange
    int input = 3;
    String expectedResult = "III";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 10: input 4 should not equal \"IIII\"")
  public void test_number4_shouldNotEqualsIIII() {
    // Arrange
    int input = 4;
    String expectedResult = "IIII";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertNotEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("case 10: input 4 should not equal \"IV\"")
  public void test_number4_shouldReturnIV() {
    // Arrange
    int input = 4;
    String expectedResult = "IV";
    RomanNumber romanNumber = new RomanNumber();

    // Act
    String actualResult = romanNumber.convert(input);

    // Assert
    assertEquals(expectedResult, actualResult);
  }

}
