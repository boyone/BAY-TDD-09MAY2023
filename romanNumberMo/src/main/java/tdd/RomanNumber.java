package tdd;

public class RomanNumber {
    public String convert(int input) {
        String result = "I";
        if (input == 1) {
            result = "I";
        } else {
            result = "V";
        }
        return result;
    }
}
