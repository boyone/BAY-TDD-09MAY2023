package tdd;

public class RomanNumber {

    public String convert(int input) {
        if (input == 1) {
            return "I";
        } else if (input == 2) {
            return "II";
        } else {
            return "";
        }
    }

}
