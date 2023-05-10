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
    if (1 <= input && 3 >= input) {
      for (int i = 1; i <= input; i++) {
        result.append(ONE);
      }
    } else if(4 == input){
      result = new StringBuilder().append(ONE).append(FIVE);
    }else if (5 == input) {
      result = new StringBuilder(FIVE);
    } else if (10 == input) {
      result = new StringBuilder(TEN);
    } else if (50 == input) {
      result = new StringBuilder(FIFTY);
    } else if (100 == input) {
      result = new StringBuilder(HUNDRED);
    } else if (500 == input) {
      result = new StringBuilder(FIVE_HUNDRED);
    } else if (1000 == input) {
      result = new StringBuilder(THOUSAND);
    }
    return result.toString();
  }
}
