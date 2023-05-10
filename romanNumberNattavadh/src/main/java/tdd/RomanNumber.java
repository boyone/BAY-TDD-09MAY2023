package tdd;

public class RomanNumber {

  private final String ONE = "I";
  private final String FIVE = "V";
  private final String TEN = "X";
  private final String FIFTY = "L";
  private final String HUNDRED = "C";
  private final String FIVE_HUNDRED = "D";
  private final String THOUSAND = "M";


  public String convert(int input) {
    return calculate(input);
  }

  private String calculate(int input) {
    StringBuilder result = new StringBuilder();

    int thousandNumber = input / 1000;
    int remaining = input % 1000;
    String mReferThousand = "";
    if (thousandNumber > 0) {
      mReferThousand = forLoopSymbol(thousandNumber * 1000, 1000, THOUSAND, new StringBuilder()).toString();
    }

    int fiveHundredNumber = remaining / 500;
    remaining = remaining % 500;
    String dReferFiveHundred = "";
    if (fiveHundredNumber > 0) {
      dReferFiveHundred = FIVE_HUNDRED;
    }
    int hundredNumber = remaining / 100;
    remaining = remaining % 100;
    String cReferHundred = "";
    if (hundredNumber > 0) {
      cReferHundred = forLoopSymbol(hundredNumber * 100, 100, HUNDRED, new StringBuilder()).toString();
    }
    if (fiveHundredNumber == 1 && hundredNumber == 4) {
      dReferFiveHundred = "";
      cReferHundred = HUNDRED + THOUSAND;
    }
    if (fiveHundredNumber == 0 && hundredNumber == 4) {
      dReferFiveHundred = "";
      cReferHundred = HUNDRED + FIVE_HUNDRED;
    }

    int fiftyNumber = remaining / 50;
    remaining = remaining % 50;
    String lReferFifty = "";
    if (fiftyNumber > 0) {
      lReferFifty = FIFTY;
    }

    int tenNumber = remaining / 10;
    remaining = remaining % 10;
    String xReferTen = "";
    if (tenNumber > 0) {
      xReferTen = forLoopSymbol(tenNumber * 10, 10, TEN, new StringBuilder()).toString();
    }
    if (fiftyNumber == 1 && tenNumber == 4) {
      lReferFifty = "";
      xReferTen = TEN + HUNDRED;
    } else if (fiftyNumber == 0 && tenNumber == 4) {
      lReferFifty = "";
      xReferTen = TEN + FIFTY;
    }

    int fiveNumber = remaining / 5;
    remaining = remaining % 5;
    String vReferFive = "";
    if (fiveNumber > 0) {
      vReferFive = FIVE;
    }

    String oneNumber = "";
    if (remaining > 0) {
      oneNumber = forLoopSymbol(remaining, 1, ONE, new StringBuilder()).toString();
    }
    if (fiveNumber == 1 && remaining == 4) {
      vReferFive = "";
      oneNumber = ONE + TEN;
    }
    if (fiveNumber == 0 && remaining == 4) {
      vReferFive = "";
      oneNumber = ONE + FIVE;
    }

    return result
        .append(mReferThousand)
        .append(dReferFiveHundred)
        .append(cReferHundred)
        .append(lReferFifty)
        .append(xReferTen)
        .append(vReferFive)
        .append(oneNumber)
        .toString();
  }

  private StringBuilder forLoopSymbol(int input, int increase, String symbol,
      StringBuilder result) {
    if (input == 0) {
      return new StringBuilder();
    }
    int i = increase;
    do {
      result.append(symbol);
      i = i + increase;
    } while (i <= input);
    return result;
  }
}
