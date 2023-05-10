package tdd;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RomanNumberTest {

  @Test
  @DisplayName("case 1: Expect with one digit symbol \"I\",\"V\",\"X\",\"L\",\"C\",\"D\",\"M\"")
  void assertOneDigit() {
    // Arrange
    RomanNumber romanNumber = new RomanNumber();
    // Act

    // Assert
    assertAll("Expect with one digit symbol",
        () -> assertEquals("I", romanNumber.convert(1), "1 == I"),
        () -> assertEquals("V", romanNumber.convert(5), "5 == V"),
        () -> assertEquals("X", romanNumber.convert(10), "10 == X"),
        () -> assertEquals("L", romanNumber.convert(50), "50 == L"),
        () -> assertEquals("C", romanNumber.convert(100), "100 == C"),
        () -> assertEquals("D", romanNumber.convert(500), "500 == D"),
        () -> assertEquals("M", romanNumber.convert(1000), "1000 == M"));
  }

  @Test
  @DisplayName("case 2: Expect with duplicated digit symbol \"II\",\"III\",\"XX\",\"XXX\",\"CC\",\"CCC\",\"MM\",\"MMM\"")
  void assertDuplicateDigit() {
    // Arrange
    RomanNumber romanNumber = new RomanNumber();

    // Act

    // Assert
    assertAll("Expect with duplicated digit symbol",
        () -> assertEquals("II", romanNumber.convert(2)),
        () -> assertEquals("III", romanNumber.convert(3)),
        () -> assertEquals("XX", romanNumber.convert(20)),
        () -> assertEquals("XXX", romanNumber.convert(30)),
        () -> assertEquals("CC", romanNumber.convert(200)),
        () -> assertEquals("CCC", romanNumber.convert(300)),
        () -> assertEquals("MM", romanNumber.convert(2000)),
        () -> assertEquals("MMM", romanNumber.convert(3000)));
  }

  @Test
  @DisplayName("case 3: Expect Combination with prefix symbol")
  void assertPrefixCombinationSymbol() {
    // Arrange
    RomanNumber romanNumber = new RomanNumber();

    // Act

    // Assert
    assertAll("Expect Combination with prefix symbol",
        () -> assertEquals("IV", romanNumber.convert(4)),
        () -> assertEquals("IX", romanNumber.convert(9)),
        () -> assertEquals("XL", romanNumber.convert(40)),
        () -> assertEquals("XC", romanNumber.convert(90)),
        () -> assertEquals("CD", romanNumber.convert(400)),
        () -> assertEquals("CM", romanNumber.convert(900)));
  }

  @Test
  @DisplayName("case 4: Expect Combination with suffix symbol")
  void assertSuffixCombinationSymbol() {
    // Arrange
    RomanNumber romanNumber = new RomanNumber();

    // Act

    // Assert
    assertAll("Expect Combination with suffix symbol",
        () -> assertEquals("VI", romanNumber.convert(6)),
        () -> assertEquals("VII", romanNumber.convert(7)),
        () -> assertEquals("VIII", romanNumber.convert(8)),

        () -> assertEquals("XI", romanNumber.convert(11)),
        () -> assertEquals("XII", romanNumber.convert(12)),
        () -> assertEquals("XIII", romanNumber.convert(13)),

        () -> assertEquals("LX", romanNumber.convert(60)),
        () -> assertEquals("LXX", romanNumber.convert(70)),
        () -> assertEquals("LXXX", romanNumber.convert(80)),

        () -> assertEquals("CX", romanNumber.convert(110)),
        () -> assertEquals("CXX", romanNumber.convert(120)),
        () -> assertEquals("CXXX", romanNumber.convert(130)),

        () -> assertEquals("DC", romanNumber.convert(600)),
        () -> assertEquals("DCC", romanNumber.convert(700)),
        () -> assertEquals("DCCC", romanNumber.convert(800)));
  }

  @Test
  @DisplayName("case 5: Number with complexity")
  void assertNumberWithComplexity() {
    // Arrange
    RomanNumber romanNumber = new RomanNumber();

    // Act

    // Assert
    assertAll("Number with complexity",
        () -> assertEquals("MCCXXXIV", romanNumber.convert(1234)),
        () -> assertEquals("CMXCIX", romanNumber.convert(999)),
        () -> assertEquals("CDXLIV", romanNumber.convert(444)));
  }
}
