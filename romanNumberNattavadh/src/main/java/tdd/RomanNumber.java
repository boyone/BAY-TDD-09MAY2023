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
    if (1 == input){
      return ONE;
    }
    else return  "N/A";
  }
}
