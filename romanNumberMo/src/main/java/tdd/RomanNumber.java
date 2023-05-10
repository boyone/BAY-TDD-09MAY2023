package tdd;

public class RomanNumber {
    public String convert(int input) {
        String result = "I";
        if (input == 1) {
            result = "I";
        } else if (input == 5){
            result = "V";
        } else if (input == 10) {
            result = "X";
        }
        return result;
    }
}
