package tdd;

public class RomanNumber {

    String covert(int input) {
        if (input == 1) {
            return "I";
        } else if (input == 2) {
            return "II";
        } else if (input == 3) {
            return "III";
        }
        return "";
    }

}
